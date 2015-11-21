package entityPackage;

import entityPackage.Categorie;
import entityPackage.Langue;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-21T20:30:35")
@StaticMetamodel(Denominationcat.class)
public class Denominationcat_ { 

    public static volatile SingularAttribute<Denominationcat, Integer> iddenomination;
    public static volatile SingularAttribute<Denominationcat, Langue> idlangue;
    public static volatile SingularAttribute<Denominationcat, String> denom;
    public static volatile SingularAttribute<Denominationcat, Categorie> idcategorie;

}