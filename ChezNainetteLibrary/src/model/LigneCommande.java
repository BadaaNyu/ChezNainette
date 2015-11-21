/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author François
 */
public class LigneCommande {
    private int idCom_art;
    private int quantite;
    private double prix;
    private Article article;
    
    public LigneCommande(){
        
    }
    
    /**
     * @return the idCom_art
     */
    public int getIdCom_art() {
        return idCom_art;
    }

    /**
     * @param idCom_art the idCom_art to set
     */
    public void setIdCom_art(int idCom_art) {
        this.idCom_art = idCom_art;
    }

    /**
     * @return the quantite
     */
    public int getQuantite() {
        return quantite;
    }

    /**
     * @param quantite the quantite to set
     */
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    /**
     * @return the prix
     */
    public double getPrix() {
        return prix;
    }

    /**
     * @param prix the prix to set
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }

    /**
     * @return the article
     */
    public Article getArticle() {
        return article;
    }

    /**
     * @param article the article to set
     */
    public void setArticle(Article article) {
        this.article = article;
    }
}
