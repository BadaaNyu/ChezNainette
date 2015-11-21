/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeanPackage;

import entityPackage.Description;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author François
 */
@Local
public interface DescriptionFacadeLocal {

    void create(Description description);

    void edit(Description description);

    void remove(Description description);

    Description find(Object id);

    List<Description> findAll();

    List<Description> findRange(int[] range);

    int count();
    
}
