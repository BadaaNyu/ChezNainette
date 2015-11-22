/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBeans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Locale;
import javax.faces.context.FacesContext;

/**
 *
 * @author François
 */
@Named(value = "internationalisationControleur")
@SessionScoped
public class InternationalisationControleur implements Serializable {

    /**
     * Creates a new instance of InternationalisationControleur
     */
    
    private Locale locale= new Locale("en");
    
    public InternationalisationControleur() {
    }

    /**
     * @return the local
     */
    public Locale getLocale() {
        return locale;
    }
    
    public void settoEnglish(){
        locale = new Locale("en");
    }
    
    public void settoFrancais(){
        locale = new Locale("fr");
        FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
    }
    
}
