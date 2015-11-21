package entityPackage;

import entityPackage.Adresse;
import entityPackage.Commande;
import entityPackage.Langue;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-21T20:30:35")
@StaticMetamodel(Client.class)
public class Client_ { 

    public static volatile SingularAttribute<Client, String> adressemail;
    public static volatile SingularAttribute<Client, String> nomprenom;
    public static volatile SingularAttribute<Client, Langue> idlangue;
    public static volatile SingularAttribute<Client, Adresse> idadresse;
    public static volatile SingularAttribute<Client, Integer> idclient;
    public static volatile SingularAttribute<Client, String> motdepasse;
    public static volatile SingularAttribute<Client, String> numtel;
    public static volatile CollectionAttribute<Client, Commande> commandeCollection;

}