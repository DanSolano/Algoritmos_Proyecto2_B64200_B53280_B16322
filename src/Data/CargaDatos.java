/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Domain.Usuario;
import GUI.Login.Login;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author daniel
 */
public class CargaDatos {

    public CargaDatos() {
        try {
            getOperadores();
            getAdministradores();

            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");

            Login login = new Login();
            login.setVisible(true);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(CargaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Aqui se crean los metodos que cargan  a los TDAs  la informacion de cada archivo
    public void getOperadores() {

        LinkedList<Usuario> operadores = new LinkedList<Usuario>();
        // operadores 
    }

    public void getAdministradores() {
        LinkedList<Usuario> administradores = new LinkedList<Usuario>();
    }
}
