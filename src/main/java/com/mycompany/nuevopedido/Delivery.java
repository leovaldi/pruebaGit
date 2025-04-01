/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nuevopedido;

/**
 *
 * @author Usuario
 */
public class Delivery extends Entrega implements Estado{
    private double precio;
    private EstadoPedido estado;
    private Repartidor repartidor;

    public Delivery(double precio, EstadoPedido estado, Repartidor repartidor, int numeroEntrega, String descripcion, Pedido pedido) {
        super(numeroEntrega, descripcion, pedido);
        this.precio = precio;
        this.estado = estado;
        this.repartidor = repartidor;
    }
    
    public Delivery() {
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

    public Repartidor getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }

    @Override
    public int getNumeroEntrega() {
        return numeroEntrega;
    }

    @Override
    public void setNumeroEntrega(int numeroEntrega) {
        this.numeroEntrega = numeroEntrega;
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
    public boolean estado(EstadoPedido estado) {
        return false;
    }

}
