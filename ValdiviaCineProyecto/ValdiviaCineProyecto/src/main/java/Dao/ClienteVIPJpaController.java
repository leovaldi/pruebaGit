/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Dao.exceptions.NonexistentEntityException;
import Modelo.ClienteVIP;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Usuario
 */
public class ClienteVIPJpaController implements Serializable {

    public ClienteVIPJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public ClienteVIPJpaController () {
        emf = Persistence.createEntityManagerFactory("CineJPAPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ClienteVIP clienteVIP) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(clienteVIP);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ClienteVIP clienteVIP) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            clienteVIP = em.merge(clienteVIP);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = clienteVIP.getId();
                if (findClienteVIP(id) == null) {
                    throw new NonexistentEntityException("The clienteVIP with id " + id + " no longer exists.");
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
            ClienteVIP clienteVIP;
            try {
                clienteVIP = em.getReference(ClienteVIP.class, id);
                clienteVIP.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The clienteVIP with id " + id + " no longer exists.", enfe);
            }
            em.remove(clienteVIP);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ClienteVIP> findClienteVIPEntities() {
        return findClienteVIPEntities(true, -1, -1);
    }

    public List<ClienteVIP> findClienteVIPEntities(int maxResults, int firstResult) {
        return findClienteVIPEntities(false, maxResults, firstResult);
    }

    private List<ClienteVIP> findClienteVIPEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ClienteVIP.class));
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

    public ClienteVIP findClienteVIP(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ClienteVIP.class, id);
        } finally {
            em.close();
        }
    }

    public int getClienteVIPCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ClienteVIP> rt = cq.from(ClienteVIP.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
