/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import model.Adresse;
import model.Client;

/**
 *
 * @author François
 */
@ManagedBean
@SessionScoped
public class ClientControleur {

    /**
     * Creates a new instance of ClientControleur
     */

    private Client clientActuel = new Client ();
    private Client nouveauClient = new Client ();
    private String email;
    private String motDePasse;
    private boolean isConnected = false;
    
    public ClientControleur() {
        clientActuel = new Client ();
        nouveauClient = new Client ();
        nouveauClient.setAdresse(new Adresse());
        clientActuel.setPrenom("Paul");
    }

    /**
     * @return the isConnected
     */
    public boolean isIsConnected() {
        return isConnected;
    }

    /**
     * @param isConnected the isConnected to set
     */
    public void setIsConnected(boolean isConnected) {
        this.isConnected = isConnected;
    }

    /**
     * @return the clientActuel
     */
    public Client getClientActuel() {
        return clientActuel;
    }

    /**
     * @param clientActuel the clientActuel to set
     */
    public void setClientActuel(Client clientActuel) {
        this.clientActuel = clientActuel;
    }

    /**
     * @return the nouveauClient
     */
    public Client getNouveauClient() {
        return nouveauClient;
    }

    /**
     * @param nouveauClient the nouveauClient to set
     */
    public void setNouveauClient(Client nouveauClient) {
        this.nouveauClient = nouveauClient;
    }
    
    
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the motDePasse
     */
    public String getMotDePasse() {
        return motDePasse;
    }

    /**
     * @param motDePasse the motDePasse to set
     */
    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
    
    public String verifierMdp( String mdp){
        isConnected=true;
        return "index";
    }

    public String verifierFormulaire(Client nouvClient){
        isConnected=true;
        nouveauClient = nouvClient;
        clientActuel = nouveauClient;
        return "index";
    }
}
