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
public class UnidadTransporte {

    int id;
    String placa;
    int capacidad;//1 ton, 1-5 ton, 5-10 ton, 10-30 ton
    String urlFotografia;

    public UnidadTransporte() {
    }

    public UnidadTransporte(int id, String placa, int capacidad, String urlFotografia) {
        this.id = id;
        this.placa = placa;
        this.capacidad = capacidad;
        this.urlFotografia = urlFotografia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getUrlFotografia() {
        return urlFotografia;
    }

    public void setUrlFotografia(String urlFotografia) {
        this.urlFotografia = urlFotografia;
    }

}
