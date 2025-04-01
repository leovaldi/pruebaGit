/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Usuario
 */
@Entity
public class Sala implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    protected int id;
    
    @Basic
    protected int numero;
    protected int capacidad;
    
    @OneToMany (mappedBy="sala", cascade = CascadeType.PERSIST)
    protected ArrayList<Funcion> funciones = new ArrayList();
    
    @ManyToOne
    protected Cine cineS;

    public Sala() {
    }

    public Sala(int id, int numero, int capacidad, Cine cineS) {
        this.id = id;
        this.numero = numero;
        this.capacidad = capacidad;
        this.cineS = cineS;
    }

    public Cine getCineS() {
        return cineS;
    }

    public void setCineS(Cine cineS) {
        this.cineS = cineS;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Funcion> getFunciones() {
        return funciones;
    }

    public void addFunciones(Funcion funciones) {
        this.funciones.add(funciones);
    }   
}

