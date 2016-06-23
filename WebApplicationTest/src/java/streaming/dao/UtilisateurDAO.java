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
import streaming.entity.Utilisateur;

/**
 *
 * @author admin
 */
public class UtilisateurDAO {

    public Utilisateur rechercheParLoginEtMdp(String login, String mdp) {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        Query query = em.createQuery("select u from Utilisateur u where u.pseudo=:login AND u.mdp=:mdp");
        query.setParameter("login", login);
        query.setParameter("mdp", mdp);
        // casté
        return (Utilisateur) query.getSingleResult();

    }

    public List<Utilisateur> rechercheParLogin(String login) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.createQuery("SELECT u from Utilisateur u WHERE u.pseudo=:login").setParameter("login", login).getResultList();

    }

    public void enregistrer(Utilisateur u) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();

    }

    
}
