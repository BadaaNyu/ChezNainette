/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeanPackage;

import entityPackage.Description;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author François
 */
@Stateless
public class DescriptionFacade extends AbstractFacade<Description> implements DescriptionFacadeLocal {
    @PersistenceContext(unitName = "ChezNainetteWeb-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DescriptionFacade() {
        super(Description.class);
    }
    
}
