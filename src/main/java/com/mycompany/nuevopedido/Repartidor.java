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
public class Repartidor extends Persona{
    private int numeroRepartidor;
    private ArrayList<Delivery> deliverys = new ArrayList();

    public Repartidor(int numeroRepartidor, int dni, String nombrePersona, String apellidoPersona) {
        super(dni, nombrePersona, apellidoPersona);
        this.numeroRepartidor = numeroRepartidor;
    }

    public Repartidor() {
        
    }

    public int getNumeroRepartidor() {
        return numeroRepartidor;
    }

    public void setNumeroRepartidor(int numeroRepartidor) {
        this.numeroRepartidor = numeroRepartidor;
    }

    public ArrayList<Delivery> getDeliverys() {
        return deliverys;
    }

    public void addDeliverys(Delivery deliverys) {
        this.deliverys.add(deliverys);
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
