/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import streaming.dao.SerieDAO;
import java.util.List;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class SerieService {
    
    public List<Serie> lister() {
        
        SerieDAO dao = new SerieDAO();
        
        return dao.listerTous();
    }
    
    public Serie rechercherParId(long id) {
        SerieDAO dao = new SerieDAO();
        return dao.rechercherParId(id);
        
    }
    
    public void ajouter(Serie s) {
        new SerieDAO().enregistrerSerie(s);
    }
    
    public void modifier(Serie serie) {
        new SerieDAO().modifier(serie);
    }
    
    public void supprimer(long id) {
        new SerieDAO().supprimer(id);
    }
    
}
