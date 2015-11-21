/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author François
 */
public class Categorie {
    private int idCategorie;
    private String couleur;
    private String denomination;
    private ArrayList<Article> articles;
    private ArrayList<Reduction> reduction;
    
    public Categorie (){
        
    }
    
    /**
     * @return the idCategorie
     */
    public int getIdCategorie() {
        return idCategorie;
    }

    /**
     * @param idCategorie the idCategorie to set
     */
    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    /**
     * @return the couleur
     */
    public String getCouleur() {
        return couleur;
    }

    /**
     * @param couleur the couleur to set
     */
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    /**
     * @return the denomination
     */
    public String getDenomination() {
        return denomination;
    }

    /**
     * @param denomination the denomination to set
     */
    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    /**
     * @return the articles
     */
    public ArrayList<Article> getArticles() {
        return articles;
    }

    /**
     * @param articles the articles to set
     */
    public void setArticles(ArrayList<Article> articles) {
        this.articles = articles;
    }

    /**
     * @return the reduction
     */
    public ArrayList<Reduction> getReduction() {
        return reduction;
    }

    /**
     * @param reduction the reduction to set
     */
    public void setReduction(ArrayList<Reduction> reduction) {
        this.reduction = reduction;
    }
}