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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Usuario
 */
@Entity
public class Funcion implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    @Basic
    private String horario;
    
    @OneToMany (mappedBy="funcion", cascade = CascadeType.PERSIST)
    private ArrayList<Entrada> entradas = new ArrayList();
    
    @ManyToOne
    private Pelicula pelicula;

    @ManyToOne
    @JoinColumn(name = "SALA_ID")
    private Sala sala;
    
    @OneToMany (mappedBy="funcion1", cascade = CascadeType.PERSIST)
    private ArrayList<Venta> ventas = new ArrayList();
    
    public Funcion() {
    }

    public Funcion(int id, String horario, Pelicula pelicula, Sala sala) {
        this.id = id;
        this.horario = horario;
        this.pelicula = pelicula;
        this.sala = sala;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void addVentas(Venta ventas) {
        this.ventas.add(ventas);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public ArrayList<Entrada> getEntradas() {
        return entradas;
    }

    public void addEntradas(Entrada entradas) {
        this.entradas.add(entradas);
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
}

