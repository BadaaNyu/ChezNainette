/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.ejb.Stateless;
import model.Categorie;
import sessionBeanPackage.DenominationcatFacade;

/**
 *
 * @author François
 */
@Stateless
public class ChezNainetteSession implements ChezNainetteSessionRemote {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private DenominationcatFacade denominationcatFacade;
    
    @Override
    public List<model.Categorie> findAllCatByLangue(String langue) { //EN COURS DE TEST REQUETE SQL A REFAIRE
        List<entityPackage.Denominationcat> categories = denominationcatFacade.findAllByIdLangue(langue);
        ArrayList<model.Categorie> arrayNewCat = new ArrayList <model.Categorie> ();
        List<model.Categorie> newCategories = Collections.synchronizedList(arrayNewCat);
        for (int i =0 ; i < 5;i++){//categories.size(); i++){
            if( categories.get(i).getIdlangue().getDenom().compareTo(langue) == 0){
                Categorie categorie = new Categorie ();
                categorie.setArticles(null);
                categorie.setCouleur("red");
                categorie.setDenomination("Categorie");
                categorie.setIdCategorie(1);
                categorie.setReduction(null);               
                newCategories.add( categorie);
            }
        }
        return newCategories;
    }
}
