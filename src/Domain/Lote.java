/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author daniel
 */
public class Lote {

    int id;
    public static int cont = 0;
    String codigoLote;
    Date fechaEmpacado;//fecha y hora
    Date fechaVencimiento;//corregir para que sea solo fecha

    public Lote() {
        this.id = ++cont;
    }

    public Lote(int id, String codigoLote, Date fechaEmpacado, Date fechaVencimiento) {
        this.id = cont++;
        this.codigoLote = codigoLote;
        this.fechaEmpacado = fechaEmpacado;
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoLote() {
        return codigoLote;
    }

    public void setCodigoLote(String codigoLote) {
        this.codigoLote = codigoLote;
    }

    public Date getFechaEmpacado() {
        return fechaEmpacado;
    }

    public void setFechaEmpacado(Date fechaEmpacado) {
        this.fechaEmpacado = fechaEmpacado;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

}
