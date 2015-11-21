/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author François
 */
public class Commande {
    private Date dateCom;
    private Adresse adresse;
    private LigneCommande ligneCommande;

    public Commande (){
        
    }

    /**
     * @return the dateCom
     */
    public Date getDateCom() {
        return dateCom;
    }

    /**
     * @param dateCom the dateCom to set
     */
    public void setDateCom(Date dateCom) {
        this.dateCom = dateCom;
    }

    /**
     * @return the adresse
     */
    public Adresse getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the ligneCommande
     */
    public LigneCommande getLigneCommande() {
        return ligneCommande;
    }

    /**
     * @param ligneCommande the ligneCommande to set
     */
    public void setLigneCommande(LigneCommande ligneCommande) {
        this.ligneCommande = ligneCommande;
    }
}