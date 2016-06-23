/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.LienDAO;
import streaming.entity.Lien;

/**
 *
 * @author admin
 */
public class LienService {

    public List<Lien> lister() {

        LienDAO dao = new LienDAO();

        return dao.listerTous();
    }

    public Lien rechercherParId(long id) {
        LienDAO dao = new LienDAO();
        return dao.rechercherParId(id);
    }

    public void ajouter(Lien l) {
        new LienDAO().enregistrer(l);
    }

    public void modifier(Lien lien) {
        new LienDAO().modifier(lien);
    }

    public void supprimer(long id) {
        new LienDAO().supprimer(id);
    }

}
