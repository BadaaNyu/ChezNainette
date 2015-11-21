/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeanPackage;

import entityPackage.ComArt;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author François
 */
@Local
public interface ComArtFacadeLocal {

    void create(ComArt comArt);

    void edit(ComArt comArt);

    void remove(ComArt comArt);

    ComArt find(Object id);

    List<ComArt> findAll();

    List<ComArt> findRange(int[] range);

    int count();
    
}
