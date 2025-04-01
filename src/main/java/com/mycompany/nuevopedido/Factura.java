/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nuevopedido;

/**
 *
 * @author Usuario
 */
public class Factura extends DocumentoVenta{
    private int numeroFactura;
    private TipoFactura tipoFactura;

    public Factura(int numeroFactura, TipoFactura tipoFactura, int numeroDocumentoVenta, double monto, EstadoPedido estado) {
        super(numeroDocumentoVenta, monto, estado);
        this.numeroFactura = numeroFactura;
        this.tipoFactura = tipoFactura;
    }

    public Factura() {
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public TipoFactura getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(TipoFactura tipoFactura) {
        this.tipoFactura = tipoFactura;
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
