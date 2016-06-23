/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author admin
 */
@Entity
public class Utilisateur implements Serializable {

    public enum EtatUtil {

        NON_VALIDE,
        VALIDE
    }

    public enum UtilType {

        ADMIN,
        NORMAL,

    }

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String pseudo;
    private String mdp;
    private String email;

    @Enumerated(EnumType.STRING)
    private EtatUtil etatUtil;
    
    
    
    @Enumerated(EnumType.STRING) //enumType pour garder le string 
    private UtilType typeuti;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EtatUtil getEtatUtil() {
        return etatUtil;
    }

    public void setEtatUtil(EtatUtil etatUtil) {
        this.etatUtil = etatUtil;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public UtilType getTypeuti() {
        return typeuti;
    }

    public void setTypeuti(UtilType typeuti) {
        this.typeuti = typeuti;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "streaming.entity.Utilisateur[ id=" + id + " ]";
    }

}
