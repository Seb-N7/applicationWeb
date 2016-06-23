/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import streaming.entity.Lien;

/**
 *
 * @author admin
 */
public class LienDAO {
    
    
    public List<Lien> listerTous() {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        return em.createQuery("SELECT l FROM Lien l").getResultList();

    }

    public Lien rechercherParId(long lienId) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        return em.find(Lien.class, lienId);

    }

    public void supprimer(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        Query q = em.createQuery("DELETE from Lien l WHERE l.id=:idLien");
        q.setParameter("idLien", id);
        q.executeUpdate();
    }

    public void modifier(Lien lien) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.merge(lien);
        em.getTransaction().commit();
    }
    
        public void enregistrer(Lien l) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(l);
        em.getTransaction().commit();

    }
    
    
}

