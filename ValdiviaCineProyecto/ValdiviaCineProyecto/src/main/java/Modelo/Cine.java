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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author Usuario
 */
@Entity
public class Cine implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    @Basic
    private String nombre;
    private String direccion;
    
    @OneToMany (mappedBy="cine")
    private ArrayList<Compras> compras = new ArrayList();
    
    @ManyToMany
    private ArrayList<Empleado> empleados = new ArrayList();
    
    @OneToMany (mappedBy="cinep")
    private ArrayList<Pelicula> peliculas = new ArrayList();
    
    @OneToMany (mappedBy="cineV", cascade = CascadeType.PERSIST)
    private ArrayList<Venta> ventas = new ArrayList();
    
    @OneToMany (mappedBy="cineS")
    private ArrayList<SalaVIP> salasVIP = new ArrayList();
    
    @OneToMany (mappedBy="cineS")
    private ArrayList<Sala> salas = new ArrayList();
    
    public Cine() {
    }

    public Cine(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Compras> getCompras() {
        return compras;
    }

    public void addCompras(Compras compras) {
        this.compras.add(compras);
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void addEmpleados(Empleado empleados) {
        this.empleados.add(empleados);
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void addPeliculas(Pelicula peliculas) {
        this.peliculas.add(peliculas);
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void addVentas(Venta ventas) {
        this.ventas.add(ventas);
    }

    public ArrayList<SalaVIP> getSalasVIP() {
        return salasVIP;
    }

    public void addSalasVIP(SalaVIP salasVIP) {
        this.salasVIP.add(salasVIP);
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void addSalas(Sala salas) {
        this.salas.add(salas);
    }
    
}

