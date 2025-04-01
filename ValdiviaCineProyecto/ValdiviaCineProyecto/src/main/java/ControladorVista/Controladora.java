/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControladorVista;

import Modelo.Cliente;
import Modelo.Controlador;
import Modelo.Pelicula;
import Modelo.Entrada;
import Modelo.Funcion;
import Vista.InicioView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Controladora implements ActionListener {

    private Controlador control;  // El controlador principal que maneja la lógica de negocio
    private InicioView inicioView; // La vista principal donde interactúa el usuario

    public Controladora(Controlador control, InicioView inicioView) {
        this.control = control;
        this.inicioView = inicioView;
        this.inicioView.setVisible(true);
        this.inicioView.setLocationRelativeTo(null);

        // Registrar los botones con sus respectivos escuchadores
        this.inicioView.jButtonCompra.addActionListener(this);
        this.inicioView.jButtonSalir.addActionListener(this);
        this.inicioView.jButton1.addActionListener(this);

        // Cargar las películas en el ComboBox y la tabla
        cargarPeliculasEnComboBox();
        cargarPeliculasEnTabla();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Evento para el botón "Comprar"
        if (e.getSource() == inicioView.jButtonCompra) {
            comprarEntrada();
        }

        // Evento para el botón "Salir"
        if (e.getSource() == inicioView.jButtonSalir) {
            salir();
        }

        // Evento para el botón "Registrarse"
        if (e.getSource() == inicioView.jButton1) {
            registrarCliente();
        }
    }

    // Método para manejar la compra de una entrada
    private void comprarEntrada() {
        // Obtener la película seleccionada del ComboBox
        String tituloSeleccionado = (String) inicioView.jComboBoxPeliculas.getSelectedItem();

        // Verificar que se haya seleccionado una película
        if (tituloSeleccionado == null || tituloSeleccionado.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una película.");
            return;
        }

        // Buscar la película seleccionada directamente desde la base de datos
        Pelicula peliculaSeleccionada = control.listaPelicula().stream()
                .filter(pelicula -> pelicula.getTitulo().equals(tituloSeleccionado))
                .findFirst()
                .orElse(null);  // Si no se encuentra, devolvemos null

        if (peliculaSeleccionada == null) {
            JOptionPane.showMessageDialog(null, "Película no encontrada.");
            return;
        }

        // Obtener la primera función de la película seleccionada (esto lo puedes modificar si el usuario puede elegir la función)
        Funcion funcionSeleccionada = peliculaSeleccionada.getFunciones().get(0);

        // Generar un número aleatorio para el asiento
        int asiento = (int) (Math.random() * 99 + 1);

        // Crear una entrada
        Entrada nuevaEntrada = new Entrada();
        nuevaEntrada.setFuncion(funcionSeleccionada);
        nuevaEntrada.setPrecio(5000); // Precio fijo por ahora
        nuevaEntrada.setAsiento(String.valueOf(asiento));

        // Registrar al cliente en la base de datos
        Cliente cliente = new Cliente(inicioView.txtNombre.getText(), inicioView.txtEmail.getText());
        control.crearCliente(cliente);  // Guardar el cliente en la base de datos
        
        // Mostrar un resumen de la compra
        new resumenCompraView(nuevaEntrada, cliente);
    }

    // Método para manejar el registro del cliente
    private void registrarCliente() {
        String nombre = inicioView.txtNombre.getText().trim();
        String email = inicioView.txtEmail.getText().trim();

        // Validar que los campos no estén vacíos
        if (nombre.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos.");
            return;
        }

        // Crear el cliente sin asignar un 'id', ya que la base de datos lo generará
        Cliente cliente = new Cliente(nombre, email);

        // Registrar al cliente en la base de datos
        control.crearCliente(cliente);

        // Limpiar los campos de texto
        inicioView.txtNombre.setText("");
        inicioView.txtEmail.setText("");

        // Confirmación
        JOptionPane.showMessageDialog(null, "¡Cliente registrado con éxito!");
    }

    // Método para cargar las películas en el ComboBox desde la base de datos
    // Método para cargar las películas en el ComboBox desde la base de datos
    private void cargarPeliculasEnComboBox() {
        // Limpiar el ComboBox antes de cargar las películas
        inicioView.jComboBoxPeliculas.removeAllItems();

        // Obtener todas las películas desde la base de datos (esto es parte del controlador)
        for (Pelicula pelicula : control.listaPelicula()) {
            inicioView.jComboBoxPeliculas.addItem(pelicula.getTitulo());  // Agregar cada título al ComboBox
        }
    }


    // Método para cargar las películas en la tabla desde la base de datos
    private void cargarPeliculasEnTabla() {
        DefaultTableModel model = (DefaultTableModel) inicioView.jTablePeliculas.getModel();
        model.setRowCount(0); // Limpiar tabla antes de cargar

        // Obtener todas las películas desde la base de datos
        for (Pelicula pelicula : control.listaPelicula()) {
            for (Funcion funcion : pelicula.getFunciones()) {
                String[] row = new String[] {
                    pelicula.getTitulo(),
                    String.valueOf(funcion.getSala().getNumero()), // Número de la sala
                    funcion.getHorario() != null ? funcion.getHorario().toString() : "Desconocido" // Horario de la función
                };
                model.addRow(row);
            }
        }
    }

    // Método para salir de la aplicación
    private void salir() {
        System.exit(0);
    }
}
