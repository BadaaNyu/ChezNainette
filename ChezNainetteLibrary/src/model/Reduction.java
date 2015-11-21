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
public class Reduction {
    private int idReduciton;
    private double pourcentageReduc;
    private Date dateDebut;
    private Date dateFin;
    private String codeSecret;
    private Categorie Reduction;

    public Reduction (){
        
    }
    
    /**
     * @return the idReduciton
     */
    public int getIdReduciton() {
        return idReduciton;
    }

    /**
     * @param idReduciton the idReduciton to set
     */
    public void setIdReduciton(int idReduciton) {
        this.idReduciton = idReduciton;
    }

    /**
     * @return the pourcentageReduc
     */
    public double getPourcentageReduc() {
        return pourcentageReduc;
    }

    /**
     * @param pourcentageReduc the pourcentageReduc to set
     */
    public void setPourcentageReduc(double pourcentageReduc) {
        this.pourcentageReduc = pourcentageReduc;
    }

    /**
     * @return the dateDebut
     */
    public Date getDateDebut() {
        return dateDebut;
    }

    /**
     * @param dateDebut the dateDebut to set
     */
    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    /**
     * @return the dateFin
     */
    public Date getDateFin() {
        return dateFin;
    }

    /**
     * @param dateFin the dateFin to set
     */
    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    /**
     * @return the codeSecret
     */
    public String getCodeSecret() {
        return codeSecret;
    }

    /**
     * @param codeSecret the codeSecret to set
     */
    public void setCodeSecret(String codeSecret) {
        this.codeSecret = codeSecret;
    }

    /**
     * @return the Reduction
     */
    public Categorie getReduction() {
        return Reduction;
    }

    /**
     * @param Reduction the Reduction to set
     */
    public void setReduction(Categorie Reduction) {
        this.Reduction = Reduction;
    }
}
