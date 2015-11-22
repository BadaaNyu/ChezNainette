package entityPackage;

import entityPackage.Client;
import entityPackage.Commande;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-22T13:27:56")
@StaticMetamodel(Adresse.class)
public class Adresse_ { 

    public static volatile SingularAttribute<Adresse, String> ville;
    public static volatile SingularAttribute<Adresse, String> rue;
    public static volatile SingularAttribute<Adresse, String> codepostal;
    public static volatile CollectionAttribute<Adresse, Client> clientCollection;
    public static volatile SingularAttribute<Adresse, Integer> idadresse;
    public static volatile CollectionAttribute<Adresse, Commande> commandeCollection;
    public static volatile SingularAttribute<Adresse, String> pays;

}