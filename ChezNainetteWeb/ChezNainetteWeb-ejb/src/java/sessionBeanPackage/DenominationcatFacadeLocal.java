/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeanPackage;

import entityPackage.Denominationcat;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author François
 */
@Local
public interface DenominationcatFacadeLocal {

    void create(Denominationcat denominationcat);

    void edit(Denominationcat denominationcat);

    void remove(Denominationcat denominationcat);

    Denominationcat find(Object id);

    List<Denominationcat> findAll();

    List<Denominationcat> findRange(int[] range);

    int count();
    
}
