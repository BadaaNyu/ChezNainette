package entityPackage;

import entityPackage.Categorie;
import entityPackage.ComArt;
import entityPackage.Description;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-21T20:30:35")
@StaticMetamodel(Article.class)
public class Article_ { 

    public static volatile CollectionAttribute<Article, ComArt> comArtCollection;
    public static volatile SingularAttribute<Article, Integer> idarticle;
    public static volatile SingularAttribute<Article, BigDecimal> prix;
    public static volatile SingularAttribute<Article, BigDecimal> largeur;
    public static volatile SingularAttribute<Article, BigDecimal> profondeur;
    public static volatile SingularAttribute<Article, BigDecimal> poids;
    public static volatile SingularAttribute<Article, String> photo;
    public static volatile SingularAttribute<Article, Categorie> idcategorie;
    public static volatile SingularAttribute<Article, BigDecimal> hauteur;
    public static volatile CollectionAttribute<Article, Description> descriptionCollection;

}