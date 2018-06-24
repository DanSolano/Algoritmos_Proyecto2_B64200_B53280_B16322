/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Domain.Categoria;
import Domain.Usuario;
import GUI.Login.Login;
import Utilities.StringPath;
import java.util.HashMap;
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

    public static LinkedList<Usuario> USUARIOS;
    public static HashMap<String,Categoria> CATEGORIA;

    public CargaDatos() {
        try {
            getUsuarios();
            getLote();
            getProductoMayorista();

            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");

            Login login = new Login();
            login.setVisible(true);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(CargaDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Aqui se crean los metodos que cargan  a los TDAs  la informacion de cada archivo
    private void getUsuarios() {
        DataCSV clientCSV = new DataCSV(StringPath.PATH_USUARIO);
        LinkedList<Usuario> operadores = new LinkedList<Usuario>();

        operadores = clientCSV.readUsuario();
        USUARIOS = operadores;
    }

    private void getLote() {

    }

    private void getProductoMayorista() {
    }

}
