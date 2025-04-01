/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 *
 * @author Usuario
 */
@Entity
public class SalaVIP extends Sala{
    
    
    
    @Basic
    private String beneficios;
    
    
    public SalaVIP() {
    }

    public SalaVIP(String beneficios) {
        this.beneficios = beneficios;
    }

    public SalaVIP(String beneficios, int id, int numero, int capacidad, Cine cineS) {
        super(id, numero, capacidad, cineS);
        this.beneficios = beneficios;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    @Override
    public int getNumero() {
        return numero;
    }

    @Override
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public ArrayList<Funcion> getFunciones() {
        return funciones;
    }

    @Override
    public void addFunciones(Funcion funciones) {
        this.funciones.add(funciones);
    }   
}

