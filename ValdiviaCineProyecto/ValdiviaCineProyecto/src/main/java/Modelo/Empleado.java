/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Usuario
 */
@Entity
public class Empleado implements Serializable {
 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    @Basic
    private String nombre;
    private int dni;
    
    @ManyToMany
    private ArrayList<Cine> cine = new ArrayList();

    public Empleado() {
    }

    public Empleado(int id, String nombre, int dni) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public ArrayList<Cine> getCine() {
        return cine;
    }

    public void addCine(Cine cine) {
        this.cine.add(cine);
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }   
}

