/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author daniel
 */
public class Bodega {

    int id;
    String nombre;
    String latitud;
    String longitud;
    float distanciaCentroOperaciones;//en KM
    String urlFotografia;

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

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public float getDistanciaCentroOperaciones() {
        return distanciaCentroOperaciones;
    }

    public void setDistanciaCentroOperaciones(float distanciaCentroOperaciones) {
        this.distanciaCentroOperaciones = distanciaCentroOperaciones;
    }

    public String getUrlFotografia() {
        return urlFotografia;
    }

    public void setUrlFotografia(String urlFotografia) {
        this.urlFotografia = urlFotografia;
    }

    public Bodega(int id, String nombre, String latitud, String longitud, float distanciaCentroOperaciones, String urlFotografia) {
        this.id = id;
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
        this.distanciaCentroOperaciones = distanciaCentroOperaciones;
        this.urlFotografia = urlFotografia;
    }

    public Bodega() {
    }

}
