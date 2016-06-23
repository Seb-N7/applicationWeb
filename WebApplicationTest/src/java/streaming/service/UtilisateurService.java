/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.UtilisateurDAO;
import streaming.entity.Utilisateur;

/**
 *
 * @author admin
 */
public class UtilisateurService {

    public Utilisateur rechercheParLoginEtMdp(String login, String mdp) {

        return new UtilisateurDAO().rechercheParLoginEtMdp(login, mdp);
    }

    public void inscription(Utilisateur util) {
        UtilisateurDAO dao = new UtilisateurDAO();
        

        //validation
        //Trow exception si login existe
        List<Utilisateur> listeUtilAvecCeLogin = dao.rechercheParLogin(util.getPseudo());

        if ( listeUtilAvecCeLogin.size() > 0) {
            throw new RuntimeException("ce login existe deja");
        }
        
        //passe l utilisateur a l etat non valide
        util.setEtatUtil(Utilisateur.EtatUtil.NON_VALIDE);
        
        
        //periste
        dao.enregistrer(util);
        
        // env mail
        new MailService().envoyerMail(util.getEmail(), "", "");
          
        
    }
}
