/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Usuario
 */
@Entity
public class Venta implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    @Temporal(TemporalType.DATE)
    private Date fecha;
    
    @ManyToOne
    private Cliente cliente;
    
    @ManyToOne
    private Funcion funcion1;
    
    @ManyToOne
    private Pago pago;
    
    @ManyToOne
    private Cine cineV;
   

    public Venta() {
    }

    public Venta(int id, Date fecha, Cliente cliente, Funcion funcion1, Pago pago, Cine cineV) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.funcion1 = funcion1;
        this.pago = pago;
        this.cineV = cineV;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Cine getCineV() {
        return cineV;
    }

    public void setCineV(Cine cineV) {
        this.cineV = cineV;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public Funcion getFuncion1() {
        return funcion1;
    }

    public void setFuncion1(Funcion funcion1) {
        this.funcion1 = funcion1;
    }
}

