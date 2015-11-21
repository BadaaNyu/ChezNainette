package entityPackage;

import entityPackage.Article;
import entityPackage.Langue;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-21T20:30:35")
@StaticMetamodel(Description.class)
public class Description_ { 

    public static volatile SingularAttribute<Description, Article> idarticle;
    public static volatile SingularAttribute<Description, Integer> iddescription;
    public static volatile SingularAttribute<Description, String> description;
    public static volatile SingularAttribute<Description, Langue> idlangue;
    public static volatile SingularAttribute<Description, String> denom;

}