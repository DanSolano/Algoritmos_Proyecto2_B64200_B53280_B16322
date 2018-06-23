/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import static Domain.Lote.cont;
import java.io.Serializable;

/**
 *
 * @author daniel
 */
public class Usuario implements Serializable {

    int id;
    public static int cont = 0;
    String nombre;
    String rol;//Administrador, operador
    String usuario;
    String contraseña;

    public Usuario() {
        this.id = ++cont;
    }

    public Usuario(String nombre, String rol, String usuario, String contraseña) {
        this.id = cont++;
        this.id = id;
        this.nombre = nombre;
        this.rol = rol;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Usuario(int id, String nombre, String rol, String usuario, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.rol = rol;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    /**
     *
     * @return tamano del registro
     *
     */
    public int tamano() {
        return this.getNombre().length() * 2 + this.getRol().length() * 2 + this.getUsuario().length() * 2 + this.getContraseña().length() * 2 + 4;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
