package entityPackage;

import entityPackage.Article;
import entityPackage.Commande;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-21T20:30:35")
@StaticMetamodel(ComArt.class)
public class ComArt_ { 

    public static volatile SingularAttribute<ComArt, Integer> idcomArt;
    public static volatile SingularAttribute<ComArt, Article> idarticle;
    public static volatile SingularAttribute<ComArt, BigDecimal> prix;
    public static volatile SingularAttribute<ComArt, Commande> idcommande;
    public static volatile SingularAttribute<ComArt, Integer> quantite;

}