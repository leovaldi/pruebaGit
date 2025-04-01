/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Usuario
 */
@Entity
public class Compras implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    @Temporal(TemporalType.DATE)
    private Date fecha;
    
    @ManyToOne
    private Cine cine;
    
    @OneToMany (mappedBy="compras")
    private ArrayList<Proveedor> proveedores = new ArrayList();
    
    @OneToMany (mappedBy="compra")
    private ArrayList<Insumo> insumos = new ArrayList();

    public Compras() {
    }

    public Compras(int id, Date fecha, Cine cine) {
        this.id = id;
        this.fecha = fecha;
        this.cine = cine;
    }

    public Cine getCine() {
        return cine;
    }

    public void setCine(Cine cine) {
        this.cine = cine;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }

    public void addProveedores(Proveedor proveedores) {
        this.proveedores.add(proveedores);
    }

    public ArrayList<Insumo> getInsumos() {
        return insumos;
    }

    public void addInsumos(Insumo insumos) {
        this.insumos.add(insumos);
    }
    
}

