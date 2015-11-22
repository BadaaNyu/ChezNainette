package entityPackage;

import entityPackage.Client;
import entityPackage.Denominationcat;
import entityPackage.Description;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-22T13:27:56")
@StaticMetamodel(Langue.class)
public class Langue_ { 

    public static volatile SingularAttribute<Langue, Integer> idlangue;
    public static volatile CollectionAttribute<Langue, Client> clientCollection;
    public static volatile CollectionAttribute<Langue, Denominationcat> denominationcatCollection;
    public static volatile SingularAttribute<Langue, String> denom;
    public static volatile CollectionAttribute<Langue, Description> descriptionCollection;

}