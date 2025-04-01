/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nuevopedido;

/**
 *
 * @author Usuario
 */
public class Cliente extends Persona{
    private int numeroCliente;
    private String direccionCliente;
    private String telefonoCliente;
    private Pedido pedidoCliente;

    public Cliente(int numeroCliente, String direccionCliente, String telefonoCliente, Pedido pedidoCliente, int dni, String nombrePersona, String apellidoPersona) {
        super(dni, nombrePersona, apellidoPersona);
        this.numeroCliente = numeroCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
        this.pedidoCliente = pedidoCliente;
    }

    public Cliente() {
        
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public Pedido getPedidoCliente() {
        return pedidoCliente;
    }

    public void setPedidoCliente(Pedido pedidoCliente) {
        this.pedidoCliente = pedidoCliente;
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
