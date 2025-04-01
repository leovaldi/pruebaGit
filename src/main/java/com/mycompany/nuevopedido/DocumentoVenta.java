/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nuevopedido;

/**
 *
 * @author Usuario
 */
public class DocumentoVenta implements Estado{
    protected int numeroDocumentoVenta;
    protected double monto;
    protected EstadoPedido estado;

    public DocumentoVenta(int numeroDocumentoVenta, double monto, EstadoPedido estado) {
        this.numeroDocumentoVenta = numeroDocumentoVenta;
        this.monto = monto;
        this.estado = estado;
    }

    public DocumentoVenta() {
    }
    

    public int getNumeroDocumentoVenta() {
        return numeroDocumentoVenta;
    }

    public void setNumeroDocumentoVenta(int numeroDocumentoVenta) {
        this.numeroDocumentoVenta = numeroDocumentoVenta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    @Override
    public boolean estado(EstadoPedido estado) {
        return false;
    }
    
}
