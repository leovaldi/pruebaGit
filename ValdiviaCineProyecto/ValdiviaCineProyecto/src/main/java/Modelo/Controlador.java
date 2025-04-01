/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Dao.ControladoraPersistencia;
import Vista.InicioView;
import java.util.ArrayList;


/**
 *
 * @author Usuario
 */
public class Controlador {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    private InicioView inicioView;
    
    public void crearCine (Cine c) {
        controlPersis.crearCine(c);
    }
    
    public void crearPelicula (Pelicula p) {
        controlPersis.crearPelicula(p);
    }
    
    public void crearEmpleado (Empleado e) {
        controlPersis.crearEmpleado(e);
    }
    
    public void crearSala (Sala s) {
        controlPersis.crearSala(s);
    }
    
    public void crearSalaVIP (SalaVIP sv) {
        controlPersis.crearSalaVIP(sv);
    }
    
    public void crearFuncion (Funcion f) {
        controlPersis.crearFuncion(f);
    }
    
    public void crearEntrada (Entrada e) {
        controlPersis.crearEntrada(e);
    }
    
    public void crearVenta (Venta v) {
        controlPersis.crearVenta(v);
    }
    
    public void crearPago (Pago p) {
        controlPersis.crearPago(p);
    }
    
    public void crearCliente (Cliente c) {
        controlPersis.crearCliente(c);
    }
    
    public Cine traerCine(int id){
        return controlPersis.traerCine(id);
    }
    
    public Empleado traerEmpleado(int id){
        return controlPersis.traerEmpleado(id);
    }
    
    public Sala traerSala(int id){
        return controlPersis.traerSala(id);
    }
    
    public ArrayList<Sala> listaSala(){
        return controlPersis.listaSala();
    }
    
    public SalaVIP traerSalaVIP(int id){
        return controlPersis.traerSalaVIP(id);
    }
    
    public Funcion traerFuncion(int id){
        return controlPersis.traerFuncion(id);
    }
    
    public ArrayList<Funcion> listaFuncion(){
        return controlPersis.listaFuncion();
    }
    
    public Entrada traerEntrada(int id){
        return controlPersis.traerEntrada(id);
    }
    
    public ArrayList<Entrada> listaEntrada(){
        return controlPersis.listaEntrada();
    }
    
    public Pelicula traerPelicula(int id){
        return controlPersis.traerPelicula(id);
    }
    
    public ArrayList<Pelicula> listaPelicula(){
        return controlPersis.listaPelicula();
    }
    
    public Venta traerVenta(int id){
        return controlPersis.traerVenta(id);
    }
    
    public Cliente traerCliente(int id){
        return controlPersis.traerCliente(id);
    }
    
    public ArrayList<Cliente> listaCliente(){
        return controlPersis.listaCliente();
    }
    
    public boolean ValidaDato(String a){
        if (a.isEmpty() || a.isBlank()) {
            return false;
        } else {
            return true;
        }
    }  
}