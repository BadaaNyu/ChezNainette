package entityPackage;

import entityPackage.Categorie;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-21T13:29:38")
@StaticMetamodel(Reduction.class)
public class Reduction_ { 

    public static volatile SingularAttribute<Reduction, String> codesecret;
    public static volatile SingularAttribute<Reduction, Integer> idreduction;
    public static volatile SingularAttribute<Reduction, Date> datedebut;
    public static volatile SingularAttribute<Reduction, Date> datefin;
    public static volatile SingularAttribute<Reduction, Categorie> idcategorie;
    public static volatile SingularAttribute<Reduction, BigDecimal> pourcentagereduc;

}