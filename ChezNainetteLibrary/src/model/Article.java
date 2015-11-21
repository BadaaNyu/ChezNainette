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
public class Article {
    private int idArticle;
    private double prix;
    private double poids;
    private double hauteur;
    private double largeur;
    private double profondeur;
    private String photo;
    private Categorie categorie;
    private String denomAnglais;
    private String denomFrancais;
    private String descriptionAnglais;
    private String descriptionFrancais;
    
    public Article (){
        
    }

    /**
     * @return the idArticle
     */
    public int getIdArticle() {
        return idArticle;
    }

    /**
     * @param idArticle the idArticle to set
     */
    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
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
     * @return the poids
     */
    public double getPoids() {
        return poids;
    }

    /**
     * @param poids the poids to set
     */
    public void setPoids(double poids) {
        this.poids = poids;
    }

    /**
     * @return the hauteur
     */
    public double getHauteur() {
        return hauteur;
    }

    /**
     * @param hauteur the hauteur to set
     */
    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    /**
     * @return the largeur
     */
    public double getLargeur() {
        return largeur;
    }

    /**
     * @param largeur the largeur to set
     */
    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    /**
     * @return the profondeur
     */
    public double getProfondeur() {
        return profondeur;
    }

    /**
     * @param profondeur the profondeur to set
     */
    public void setProfondeur(double profondeur) {
        this.profondeur = profondeur;
    }

    /**
     * @return the photo
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * @param photo the photo to set
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * @return the categorie
     */
    public Categorie getCategorie() {
        return categorie;
    }

    /**
     * @param categorie the categorie to set
     */
    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    /**
     * @return the denomAnglais
     */
    public String getDenomAnglais() {
        return denomAnglais;
    }

    /**
     * @param denomAnglais the denomAnglais to set
     */
    public void setDenomAnglais(String denomAnglais) {
        this.denomAnglais = denomAnglais;
    }

    /**
     * @return the denomFrancais
     */
    public String getDenomFrancais() {
        return denomFrancais;
    }

    /**
     * @param denomFrancais the denomFrancais to set
     */
    public void setDenomFrancais(String denomFrancais) {
        this.denomFrancais = denomFrancais;
    }

    /**
     * @return the descriptionAnglais
     */
    public String getDescriptionAnglais() {
        return descriptionAnglais;
    }

    /**
     * @param descriptionAnglais the descriptionAnglais to set
     */
    public void setDescriptionAnglais(String descriptionAnglais) {
        this.descriptionAnglais = descriptionAnglais;
    }

    /**
     * @return the descriptionFrancais
     */
    public String getDescriptionFrancais() {
        return descriptionFrancais;
    }

    /**
     * @param descriptionFrancais the descriptionFrancais to set
     */
    public void setDescriptionFrancais(String descriptionFrancais) {
        this.descriptionFrancais = descriptionFrancais;
    }
}