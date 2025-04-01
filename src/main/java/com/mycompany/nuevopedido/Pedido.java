/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nuevopedido;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Pedido implements Estado{
    private int numeroPedido;
    private double precio;
    private EstadoPedido estado;
    private Pago pago = new Pago();
    private DocumentoVenta documentoVenta = new DocumentoVenta();
    private Entrega entrega;
    private ArrayList <Producto> productos = new ArrayList(); 

    public Pedido(int numeroPedido, double precio, EstadoPedido estado, Entrega entrega) {
        this.numeroPedido = numeroPedido;
        this.precio = precio;
        this.estado = estado;
        this.entrega = entrega;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public DocumentoVenta getDocumentoVenta() {
        return documentoVenta;
    }

    public void setDocumentoVenta(DocumentoVenta documentoVenta) {
        this.documentoVenta = documentoVenta;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void addProductos(Producto productos) {
        this.productos.add(productos);
    }
    
    @Override
    public boolean estado(EstadoPedido estado) {
        return false;
    }
}
