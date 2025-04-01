/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Dao.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Modelo.Cine;
import Modelo.Funcion;
import Modelo.Venta;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Usuario
 */
public class VentaJpaController implements Serializable {

    public VentaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
     public VentaJpaController () {
        emf = Persistence.createEntityManagerFactory("CineJPAPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Venta venta) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cine cineV = venta.getCineV();
            if (cineV != null) {
                cineV = em.getReference(cineV.getClass(), cineV.getId());
                venta.setCineV(cineV);
            }
            Funcion funcion1 = venta.getFuncion1();
            if (funcion1 != null) {
                funcion1 = em.getReference(funcion1.getClass(), funcion1.getId());
                venta.setFuncion1(funcion1);
            }
            em.persist(venta);
            if (cineV != null) {
                cineV.getVentas().add(venta);
                cineV = em.merge(cineV);
            }
            if (funcion1 != null) {
                funcion1.getVentas().add(venta);
                funcion1 = em.merge(funcion1);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Venta venta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Venta persistentVenta = em.find(Venta.class, venta.getId());
            Cine cineVOld = persistentVenta.getCineV();
            Cine cineVNew = venta.getCineV();
            Funcion funcion1Old = persistentVenta.getFuncion1();
            Funcion funcion1New = venta.getFuncion1();
            if (cineVNew != null) {
                cineVNew = em.getReference(cineVNew.getClass(), cineVNew.getId());
                venta.setCineV(cineVNew);
            }
            if (funcion1New != null) {
                funcion1New = em.getReference(funcion1New.getClass(), funcion1New.getId());
                venta.setFuncion1(funcion1New);
            }
            venta = em.merge(venta);
            if (cineVOld != null && !cineVOld.equals(cineVNew)) {
                cineVOld.getVentas().remove(venta);
                cineVOld = em.merge(cineVOld);
            }
            if (cineVNew != null && !cineVNew.equals(cineVOld)) {
                cineVNew.getVentas().add(venta);
                cineVNew = em.merge(cineVNew);
            }
            if (funcion1Old != null && !funcion1Old.equals(funcion1New)) {
                funcion1Old.getVentas().remove(venta);
                funcion1Old = em.merge(funcion1Old);
            }
            if (funcion1New != null && !funcion1New.equals(funcion1Old)) {
                funcion1New.getVentas().add(venta);
                funcion1New = em.merge(funcion1New);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = venta.getId();
                if (findVenta(id) == null) {
                    throw new NonexistentEntityException("The venta with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Venta venta;
            try {
                venta = em.getReference(Venta.class, id);
                venta.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The venta with id " + id + " no longer exists.", enfe);
            }
            Cine cineV = venta.getCineV();
            if (cineV != null) {
                cineV.getVentas().remove(venta);
                cineV = em.merge(cineV);
            }
            Funcion funcion1 = venta.getFuncion1();
            if (funcion1 != null) {
                funcion1.getVentas().remove(venta);
                funcion1 = em.merge(funcion1);
            }
            em.remove(venta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Venta> findVentaEntities() {
        return findVentaEntities(true, -1, -1);
    }

    public List<Venta> findVentaEntities(int maxResults, int firstResult) {
        return findVentaEntities(false, maxResults, firstResult);
    }

    private List<Venta> findVentaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Venta.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Venta findVenta(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Venta.class, id);
        } finally {
            em.close();
        }
    }

    public int getVentaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Venta> rt = cq.from(Venta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
