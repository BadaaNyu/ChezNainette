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
public class Caddie {
    
    private String langue;
    private ArrayList<Article> articles;

    /**
     * @return the langue
     */
    public String getLangue() {
        return langue;
    }

    /**
     * @param langue the langue to set
     */
    public void setLangue(String langue) {
        this.langue = langue;
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
    
    public void addArticle ( Article article){
        articles.add(article);
    }
    
    public void deleteArticle ( Article article ){
        //A FAIRE
    }
}
