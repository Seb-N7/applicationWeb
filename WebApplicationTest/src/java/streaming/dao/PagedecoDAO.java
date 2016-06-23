/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import streaming.entity.Utilisateur;

/**
 *
 * @author admin
 */
public class PagedecoDAO {

//    public void rechercherParLoginEtMdp(Utilisateur u) {
//        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
//        Query q = return em.createQuery("select u from Utilisateur u where u.pseudo='" + u.getPseudo() + "' and u.mdp='" + u.getMdp() + "'");
//        return (utlisateur) q.getSingleResult ();
                


//Query q = em.createQuery("select u from Utilisateur u where u.pseudo='seb' and u.mdp='seb'");
 

    public Utilisateur rechercherParLoginEtMdp(String pseudo, String mdp) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Query q = em.createQuery("select u from Utilisateur u where u.pseudo='" + pseudo + "' and u.mdp='" + mdp + "'");
        return (Utilisateur) q.getSingleResult();
    }
}
