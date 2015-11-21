/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeanPackage;

import entityPackage.Denominationcat;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author François
 */
@Stateless
public class DenominationcatFacade extends AbstractFacade<Denominationcat> implements DenominationcatFacadeLocal {
    @PersistenceContext(unitName = "ChezNainetteWeb-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DenominationcatFacade() {
        super(Denominationcat.class);
    }
    
    public List<Denominationcat> findAllByIdLangue( String langue ){
        Query q;
        q = em.createNamedQuery("Denominationcat.findByIdLangue");
        if (langue.compareTo("Anglais")==0)
            q.setParameter("idlangue",1);
        else
            q.setParameter("idlangue",2);
        return q.getResultList();
    }
}
