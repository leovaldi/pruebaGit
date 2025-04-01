/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nuevopedido;

/**
 *
 * @author Usuario
 */
public class Boleta extends DocumentoVenta{
    private int numeroBoleta;

    public Boleta(int numeroBoleta, int numeroDocumentoVenta, double monto, EstadoPedido estado) {
        super(numeroDocumentoVenta, monto, estado);
        this.numeroBoleta = numeroBoleta;
    }

    public Boleta() {
        
    }

    public int getNumeroBoleta() {
        return numeroBoleta;
    }

    public void setNumeroBoleta(int numeroBoleta) {
        this.numeroBoleta = numeroBoleta;
    }

    @Override
    public int getNumeroDocumentoVenta() {
        return numeroDocumentoVenta;
    }

    @Override
    public void setNumeroDocumentoVenta(int numeroDocumentoVenta) {
        this.numeroDocumentoVenta = numeroDocumentoVenta;
    }

    @Override
    public double getMonto() {
        return monto;
    }

    @Override
    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public EstadoPedido getEstado() {
        return estado;
    }

    @Override
    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }
    
}
