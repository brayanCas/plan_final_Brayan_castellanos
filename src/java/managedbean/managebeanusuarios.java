/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author USUARIO
 */
@Named(value = "managebeanusuarios")
@SessionScoped
public class managebeanusuarios implements Serializable {


    public managebeanusuarios() {
    }
    
}
