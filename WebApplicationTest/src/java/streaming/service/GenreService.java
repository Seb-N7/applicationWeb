/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.dao.GenreDAO;
import streaming.entity.Genre;

public class GenreService {

    public Genre rechercherParId(long id) {
        GenreDAO dao = new GenreDAO();
        return dao.rechercherParId(id);

    }

    public List<Genre> listerTous() {
        GenreDAO DAO = new GenreDAO();
        return DAO.listerTous();

    }

    public void ajouter(Genre g) {

        new GenreDAO().enregistrer(g);
    }

    public void modifier(Genre genre) {
        new GenreDAO().modifier(genre);
    }

    public void supprimer(long id) {
        new GenreDAO().supprimer(id);
    }

}
