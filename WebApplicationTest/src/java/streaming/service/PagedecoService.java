/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import streaming.dao.PagedecoDAO;
import streaming.entity.Utilisateur;

/**
 *
 * @author admin
 */
public class PagedecoService {

    public Utilisateur rechercherParLoginEtMdp(String pseudo, String mdp) {
        
        PagedecoDAO dao = new PagedecoDAO ();
        return dao.rechercherParLoginEtMdp(pseudo, mdp);
  
    }
    
    
//    public void rechercherParLoginEtMdp(Utilisateur u) {
//        PagedecoDAO dao = new PagedecoDAO();
//        dao.rechercherParLoginEtMdp(u); 
//    }

    
   
    
    

}
