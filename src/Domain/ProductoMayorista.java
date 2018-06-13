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
public class ProductoMayorista {

    int id;
    String nombre;
    String unidaMedida;//Unidades, paquetes, cajas, tarimas (Pueden existir productos iguales con distintas unidades de medida)
    int valorUnidad;
    int pesoTotal;
    String descripcion;
    int idLote;
    int idCategorita;
    double precioTotal;
    String urlFotografia;

    public ProductoMayorista() {
    }

    public ProductoMayorista(int id, String nombre, String unidaMedida, int valorUnidad, int pesoTotal, String descripcion, int idLote, int idCategorita, double precioTotal, String urlFotografia) {
        this.id = id;
        this.nombre = nombre;
        this.unidaMedida = unidaMedida;
        this.valorUnidad = valorUnidad;
        this.pesoTotal = pesoTotal;
        this.descripcion = descripcion;
        this.idLote = idLote;
        this.idCategorita = idCategorita;
        this.precioTotal = precioTotal;
        this.urlFotografia = urlFotografia;
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

    public String getUnidaMedida() {
        return unidaMedida;
    }

    public void setUnidaMedida(String unidaMedida) {
        this.unidaMedida = unidaMedida;
    }

    public int getValorUnidad() {
        return valorUnidad;
    }

    public void setValorUnidad(int valorUnidad) {
        this.valorUnidad = valorUnidad;
    }

    public int getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(int pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdLote() {
        return idLote;
    }

    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

    public int getIdCategorita() {
        return idCategorita;
    }

    public void setIdCategorita(int idCategorita) {
        this.idCategorita = idCategorita;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getUrlFotografia() {
        return urlFotografia;
    }

    public void setUrlFotografia(String urlFotografia) {
        this.urlFotografia = urlFotografia;
    }

}
