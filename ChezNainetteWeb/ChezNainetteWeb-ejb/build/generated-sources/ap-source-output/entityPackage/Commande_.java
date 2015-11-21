package entityPackage;

import entityPackage.Adresse;
import entityPackage.Client;
import entityPackage.ComArt;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-21T13:29:38")
@StaticMetamodel(Commande.class)
public class Commande_ { 

    public static volatile CollectionAttribute<Commande, ComArt> comArtCollection;
    public static volatile SingularAttribute<Commande, Date> datecom;
    public static volatile SingularAttribute<Commande, Integer> idcommande;
    public static volatile SingularAttribute<Commande, Adresse> idadresse;
    public static volatile SingularAttribute<Commande, Client> idclient;

}