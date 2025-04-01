/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nuevopedido;

/**
 *
 * @author Usuario
 */
public abstract class Persona {
    protected int dni;
    protected String nombrePersona;
    protected String apellidoPersona;
//    private static int viajes;

    public Persona(int dni, String nombrePersona, String apellidoPersona) {
        this.dni = dni;
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
    }

    public Persona() {
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

//    public static void agregarViajes() {
//        Persona.viajes++;
//    }
    
}
