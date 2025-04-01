/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nuevopedido;

/**
 *
 * @author Usuario
 */
public class Pago implements Estado{
    protected int numeroPago;
    protected String descripcion;
    protected EstadoPedido estado;
    protected double montoTotal;

    public Pago(int numeroPago, String descripcion, EstadoPedido estado, double montoTotal) {
        this.numeroPago = numeroPago;
        this.descripcion = descripcion;
        this.estado = estado;
        this.montoTotal = montoTotal;
    }

    public Pago() {
    }
    

    public int getNumeroPago() {
        return numeroPago;
    }

    public void setNumeroPago(int numeroPago) {
        this.numeroPago = numeroPago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    @Override
    public boolean estado(EstadoPedido estado) {
        return false;
    }
    
}
