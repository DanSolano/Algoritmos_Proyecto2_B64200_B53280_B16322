/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.LinkedList;

/**
 *
 * @author daniel
 */
public class OrdenDistribucion {

    int id;
    int idBodegaProcedencia;
    int idBodegaDestino;
    double montoTotal;
    float pesoTotal;
    LinkedList<ProductoMayorista> listaProductos;
    int idOperador;

    public OrdenDistribucion() {
        listaProductos = new LinkedList<>();
    }

    public OrdenDistribucion(int id, int idBodegaProcedencia, int idBodegaDestino, double montoTotal, float pesoTotal, LinkedList<ProductoMayorista> listaProductos, int idOperador) {
        this.id = id;
        this.idBodegaProcedencia = idBodegaProcedencia;
        this.idBodegaDestino = idBodegaDestino;
        this.montoTotal = montoTotal;
        this.pesoTotal = pesoTotal;
        this.listaProductos = listaProductos;
        this.idOperador = idOperador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdBodegaProcedencia() {
        return idBodegaProcedencia;
    }

    public void setIdBodegaProcedencia(int idBodegaProcedencia) {
        this.idBodegaProcedencia = idBodegaProcedencia;
    }

    public int getIdBodegaDestino() {
        return idBodegaDestino;
    }

    public void setIdBodegaDestino(int idBodegaDestino) {
        this.idBodegaDestino = idBodegaDestino;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public float getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(float pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public LinkedList<ProductoMayorista> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(LinkedList<ProductoMayorista> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public int getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(int idOperador) {
        this.idOperador = idOperador;
    }

}
