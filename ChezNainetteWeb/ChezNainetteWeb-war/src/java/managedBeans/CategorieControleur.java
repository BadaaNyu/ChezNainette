/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBeans;

import ejb.ChezNainetteSession;
import ejb.ChezNainetteSessionRemote;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import model.Article;
import model.Categorie;

/**
 *
 * @author François
 */
@ManagedBean
@SessionScoped
public class CategorieControleur {

    /**
     * Creates a new instance of CategorieControleur
     */
    
    @EJB
    private ChezNainetteSessionRemote ejbFacade;
    private Categorie categorieActuelle;
    private List<Categorie> categories = null;
    
    public CategorieControleur(){
        
    }

    private ChezNainetteSessionRemote getEjbFacade(){
        return ejbFacade;
    }
    /**
     * @return the categories
     */
    public List<Categorie> getCategories() {
/*        
        if ( categories == null ){
            String langue = "Anglais";
            categories = this.getEjbFacade().findAllCatByLangue(langue);
*/
        ArrayList<Categorie> arrayNewCat = new ArrayList<Categorie> ();
        categories = Collections.synchronizedList(arrayNewCat);
        for (int i =0 ; i < 12;i++){
            Categorie categorie = new Categorie ();
            categorie.setArticles(null);
            categorie.setCouleur("red");
            categorie.setDenomination("Categorie");
            categorie.setIdCategorie(1);
            categorie.setReduction(null);
            categories.add(categorie);
        }
        return categories;
    }
    /**
     * @param categories the categories to set
     */
    public void setCategories(List<Categorie> categories) {
        this.categories = categories;
    }
    
    public String listerArticleByCat(int idCategorie){
        categorieActuelle= categories.get(idCategorie);
        return "categorie";
    }

    /**
     * @return the categorieActuelle
     */
    public Categorie getCategorieActuelle() {
        return categorieActuelle;
    }

    /**
     * @param categorieActuelle the categorieActuelle to set
     */
    public void setCategorieActuelle(Categorie categorieActuelle) {
        this.categorieActuelle = categorieActuelle;
    }
}
