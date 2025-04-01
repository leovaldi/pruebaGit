/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
public class Pelicula implements IPromocion, Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    @Basic
    private String titulo;
    
    @Enumerated(EnumType.STRING)
    private Genero genero;
    
    @ManyToOne
    private Cine cinep;
    
    @OneToMany (mappedBy="pelicula")
    private ArrayList<Funcion> funciones = new ArrayList();
    
    @Override
    public float obtenerDescuento() {
        return 20;
    }

    public Pelicula() {
    }

    public Pelicula(int id, String titulo, Genero genero, Cine cinep) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.cinep = cinep;
    }

    public Cine getCinep() {
        return cinep;
    }

    public void setCinep(Cine cineP) {
        this.cinep = cineP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public ArrayList<Funcion> getFunciones() {
        return funciones;
    }

    public void addFunciones(Funcion funciones) {
        this.funciones.add(funciones);
    }
    
}

