/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Modelo.Cine;
import Modelo.Cliente;
import Modelo.Compras;
import Modelo.Empleado;
import Modelo.Entrada;
import Modelo.Funcion;
import Modelo.Pago;
import Modelo.Pelicula;
import Modelo.Sala;
import Modelo.SalaVIP;
import Modelo.Venta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladoraPersistencia {
    
    CineJpaController cineJPA = new CineJpaController();
    PeliculaJpaController peliJPA = new PeliculaJpaController();
    EmpleadoJpaController empleadoJPA = new EmpleadoJpaController();
    ComprasJpaController comprasJPA = new ComprasJpaController();
    VentaJpaController ventasJPA = new VentaJpaController();
    SalaVIPJpaController salasvipJPA = new SalaVIPJpaController();
    SalaJpaController salaJPA = new SalaJpaController();
    FuncionJpaController funcionJPA = new FuncionJpaController();
    EntradaJpaController entradaJPA = new EntradaJpaController();
    PagoJpaController pagoJPA = new PagoJpaController();
    ClienteJpaController clienteJPA = new ClienteJpaController();

    public void crearCine(Cine c) {
        cineJPA.create(c);
    }
    
    public void crearPelicula (Pelicula p) {
        peliJPA.create(p);
    }
    
    public void crearEmpleado (Empleado e) {
        empleadoJPA.create(e);
    }
    
    public void crearCompra (Compras c) {
        comprasJPA.create(c);
    }
    
    public void crearVenta (Venta v) {
        ventasJPA.create(v);
    }
    
    public void crearSalaVIP (SalaVIP sv) {
        salasvipJPA.create(sv);
    }
    
    public void crearSala (Sala s) {
        salaJPA.create(s);
    }
    
    public void crearFuncion (Funcion f) {
        funcionJPA.create(f);
    }
    
    public void crearEntrada (Entrada e) {
        entradaJPA.create(e);
    }
    
    public void crearPago (Pago p) {
        pagoJPA.create(p);
    }
    
    public void crearCliente (Cliente c) {
        clienteJPA.create(c);
    }
    
    public Cine traerCine(int id) {
        return cineJPA.findCine(id);
    }
    
    public Empleado traerEmpleado(int id) {
        return empleadoJPA.findEmpleado(id);
    }
    
    public Sala traerSala(int id) {
        return salaJPA.findSala(id);
    }
    
    public ArrayList<Sala> listaSala() {
        List<Sala> lista = salaJPA.findSalaEntities();
        ArrayList<Sala> listaCliente = new ArrayList<Sala>(lista);
        return listaCliente;
    }
    
    public SalaVIP traerSalaVIP(int id) {
        return salasvipJPA.findSalaVIP(id);
    }
    
    public Funcion traerFuncion(int id) {
        return funcionJPA.findFuncion(id);
    }
    
    public ArrayList<Funcion> listaFuncion() {
        List<Funcion> lista = funcionJPA.findFuncionEntities();
        ArrayList<Funcion> listaFuncion = new ArrayList<Funcion>(lista);
        return listaFuncion;
    }
    
    public Entrada traerEntrada(int id) {
        return entradaJPA.findEntrada(id);
    }
    
    public ArrayList<Entrada> listaEntrada() {
        List<Entrada> lista = entradaJPA.findEntradaEntities();
        ArrayList<Entrada> listaEntrada = new ArrayList<Entrada>(lista);
        return listaEntrada;
    }
    
    public Pelicula traerPelicula(int id) {
        return peliJPA.findPelicula(id);
    }
    
    public ArrayList<Pelicula> listaPelicula() {
        List<Pelicula> lista = peliJPA.findPeliculaEntities();
        ArrayList<Pelicula> listaPelicula = new ArrayList<Pelicula>(lista);
        return listaPelicula;
    }
    
    public Venta traerVenta (int id) {
        return ventasJPA.findVenta(id);
    }
    
    public Cliente traerCliente(int id) {
        return clienteJPA.findCliente(id);
    }
    
    public ArrayList<Cliente> listaCliente() {
        List<Cliente> lista = clienteJPA.findClienteEntities();
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>(lista);
        return listaCliente;
    }  
}
