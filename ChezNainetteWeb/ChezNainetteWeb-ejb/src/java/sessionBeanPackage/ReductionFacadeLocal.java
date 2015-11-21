/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeanPackage;

import entityPackage.Reduction;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author François
 */
@Local
public interface ReductionFacadeLocal {

    void create(Reduction reduction);

    void edit(Reduction reduction);

    void remove(Reduction reduction);

    Reduction find(Object id);

    List<Reduction> findAll();

    List<Reduction> findRange(int[] range);

    int count();
    
}
