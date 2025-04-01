/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nuevopedido;

/**
 *
 * @author Usuario
 */
public class Tarjeta extends Pago{
    private int numeroTarjeta;

    public Tarjeta(int numeroTarjeta, int numeroPago, String descripcion, EstadoPedido estado, double montoTotal) {
        super(numeroPago, descripcion, estado, montoTotal);
        this.numeroTarjeta = numeroTarjeta;
    }

    public Tarjeta() {
        
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public int getNumeroPago() {
        return numeroPago;
    }

    @Override
    public void setNumeroPago(int numeroPago) {
        this.numeroPago = numeroPago;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public EstadoPedido getEstado() {
        return estado;
    }

    @Override
    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    @Override
    public double getMontoTotal() {
        return montoTotal;
    }

    @Override
    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    
}
