/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iniciador;
import javax.persistence.EntityManager;
import Modelo.*;
/**
 *
 * @author Usuario
 */
public class DataInitializer {

    private EntityManager em;

    public DataInitializer(EntityManager em) {
        this.em = em;
    }

    public void insertarDatos() {
        try {
            em.getTransaction().begin();

            // Crear cines
            Cine cine1 = new Cine();
            cine1.setNombre("Arena Maipú");
            cine1.setDireccion("Emilio Civit 791");
            em.persist(cine1);

            Cine cine2 = new Cine();
            cine2.setNombre("Cinépolis Mendoza Shopping");
            cine2.setDireccion("Mendoza Shopping");
            em.persist(cine2);

            // Crear empleados
            Empleado emp1 = new Empleado();
            emp1.setNombre("Ricardo Fort");
            emp1.setDni(12345678);
            em.persist(emp1);

            Empleado emp2 = new Empleado();
            emp2.setNombre("Franco Colapinto");
            emp2.setDni(87654321);
            em.persist(emp2);

            // Crear películas
            Pelicula pelicula1 = new Pelicula();
            pelicula1.setTitulo("Fury");
            pelicula1.setGenero(Genero.ACCION);
            pelicula1.setCinep(cine1); // Relacionamos el cine
            em.persist(pelicula1);

            Pelicula pelicula2 = new Pelicula();
            pelicula2.setTitulo("Hereje");
            pelicula2.setGenero(Genero.DRAMA);
            pelicula2.setCinep(cine2); // Relacionamos el cine
            em.persist(pelicula2);

            // Crear salas
            Sala sala1 = new Sala();
            sala1.setNumero(1);
            sala1.setCapacidad(100);
            sala1.setCineS(cine1);
            em.persist(sala1);

            // Crear salas VIP
            SalaVIP salaVip1 = new SalaVIP();
            salaVip1.setNumero(1);
            salaVip1.setCapacidad(50);
            salaVip1.setBeneficios("Asientos reclinables, acceso prioritario");
            salaVip1.setCineS(cine2);
            em.persist(salaVip1);

            // Crear funciones
            Funcion funcion1 = new Funcion();
            funcion1.setHorario("20:00");
            funcion1.setPelicula(pelicula1);
            funcion1.setSala(sala1);
            em.persist(funcion1);

            Funcion funcion2 = new Funcion();
            funcion2.setHorario("23:00");
            funcion2.setPelicula(pelicula2);
            funcion2.setSala(salaVip1);
            em.persist(funcion2);

            em.getTransaction().commit();
            System.out.println("Datos insertados correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
    }
}

