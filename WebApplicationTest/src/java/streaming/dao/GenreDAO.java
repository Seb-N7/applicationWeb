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
import streaming.entity.Genre;

/**
 *
 * @author admin
 */
public class GenreDAO {

    public List<Genre> listerTous() {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        return em.createQuery("SELECT g FROM Genre g ORDER BY g.nom").getResultList();

    }

    public Genre rechercherParId(long genreId) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        return em.find(Genre.class, genreId);

    }

    public void supprimer(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        Query q = em.createQuery("DELETE from Genre g WHERE g.id=:idGenre");
        q.setParameter("idGenre", id);
        q.executeUpdate();
    }

    public void modifier(Genre genre) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.merge(genre);
        em.getTransaction().commit();
    }

    public void enregistrer(Genre g) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(g);
        em.getTransaction().commit();
    }

}
