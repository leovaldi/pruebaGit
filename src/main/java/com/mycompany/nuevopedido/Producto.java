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
public class Producto {
    private int numeroProducto;
    private String marca;
    private double precio;
    private int stock;
    private ArrayList <Pedido> pedidos = new ArrayList();

    public Producto(int numeroProducto, String marca, double precio, int stock) {
        this.numeroProducto = numeroProducto;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }

    public int getNumeroProducto() {
        return numeroProducto;
    }

    public void setNumeroProducto(int numeroProducto) {
        this.numeroProducto = numeroProducto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void addPedidos(Pedido pedidos) {
        this.pedidos.add(pedidos);
    }
    
}
