/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nuevopedido;

/**
 *
 * @author Usuario
 */
public class Vendedor extends Persona{
    private int numeroVendedor;
    private Pedido pedidoVendedor;

    public Vendedor(int numeroVendedor, Pedido pedidoVendedor, int dni, String nombrePersona, String apellidoPersona) {
        super(dni, nombrePersona, apellidoPersona);
        this.numeroVendedor = numeroVendedor;
        this.pedidoVendedor = pedidoVendedor;
    }

    public Vendedor() {
        
    }

    public int getNumeroVendedor() {
        return numeroVendedor;
    }

    public void setNumeroVendedor(int numeroVendedor) {
        this.numeroVendedor = numeroVendedor;
    }

    public Pedido getPedidoVendedor() {
        return pedidoVendedor;
    }

    public void setPedidoVendedor(Pedido pedidoVendedor) {
        this.pedidoVendedor = pedidoVendedor;
    }

    @Override
    public int getDni() {
        return dni;
    }

    @Override
    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String getNombrePersona() {
        return nombrePersona;
    }

    @Override
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    @Override
    public String getApellidoPersona() {
        return apellidoPersona;
    }

    @Override
    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }
    
}
