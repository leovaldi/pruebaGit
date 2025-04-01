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
import Modelo.SalaVIP;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Usuario
 */
public class SalaVIPJpaController implements Serializable {

    public SalaVIPJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
     public SalaVIPJpaController () {
        emf = Persistence.createEntityManagerFactory("CineJPAPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(SalaVIP salaVIP) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(salaVIP);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(SalaVIP salaVIP) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            salaVIP = em.merge(salaVIP);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = salaVIP.getId();
                if (findSalaVIP(id) == null) {
                    throw new NonexistentEntityException("The salaVIP with id " + id + " no longer exists.");
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
            SalaVIP salaVIP;
            try {
                salaVIP = em.getReference(SalaVIP.class, id);
                salaVIP.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The salaVIP with id " + id + " no longer exists.", enfe);
            }
            em.remove(salaVIP);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public List<SalaVIP> findSalaVIPEntities() {
        return findSalaVIPEntities(true, -1, -1);
    }

    public List<SalaVIP> findSalaVIPEntities(int maxResults, int firstResult) {
        return findSalaVIPEntities(false, maxResults, firstResult);
    }

    private List<SalaVIP> findSalaVIPEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(SalaVIP.class));
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

    public SalaVIP findSalaVIP(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(SalaVIP.class, id);
        } finally {
            em.close();
        }
    }

    public int getSalaVIPCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<SalaVIP> rt = cq.from(SalaVIP.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
