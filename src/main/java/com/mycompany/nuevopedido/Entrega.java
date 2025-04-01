/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nuevopedido;

/**
 *
 * @author Usuario
 */
public class Entrega {
    protected int numeroEntrega;
    protected String descripcion;
    private Pedido pedido;

    public Entrega(int numeroEntrega, String descripcion, Pedido pedido) {
        this.numeroEntrega = numeroEntrega;
        this.descripcion = descripcion;
        this.pedido = pedido;
    }

    public Entrega() {
    }

    public int getNumeroEntrega() {
        return numeroEntrega;
    }

    public void setNumeroEntrega(int numeroEntrega) {
        this.numeroEntrega = numeroEntrega;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
}
