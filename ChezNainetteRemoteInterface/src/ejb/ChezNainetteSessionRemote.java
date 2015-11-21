/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author François
 */
@Remote
public interface ChezNainetteSessionRemote {
    public List<model.Categorie> findAllCatByLangue(String langue);
}
