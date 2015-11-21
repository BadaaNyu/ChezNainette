package entityPackage;

import entityPackage.Article;
import entityPackage.Denominationcat;
import entityPackage.Reduction;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-21T13:29:38")
@StaticMetamodel(Categorie.class)
public class Categorie_ { 

    public static volatile CollectionAttribute<Categorie, Article> articleCollection;
    public static volatile SingularAttribute<Categorie, String> couleur;
    public static volatile CollectionAttribute<Categorie, Denominationcat> denominationcatCollection;
    public static volatile CollectionAttribute<Categorie, Reduction> reductionCollection;
    public static volatile SingularAttribute<Categorie, Integer> idcategorie;

}