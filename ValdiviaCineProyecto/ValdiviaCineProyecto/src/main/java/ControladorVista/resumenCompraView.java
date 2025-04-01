/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControladorVista;

import Modelo.Cliente;
import Modelo.Entrada;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class resumenCompraView extends JFrame {

    // Definir los JTextField para mostrar los datos
    private JTextField jTextFieldCliente;
    private JTextField jTextFieldPelicula;
    private JTextField jTextFieldSala;
    private JTextField jTextFieldHorario;
    private JTextField jTextFieldAsiento;
    private JTextField jTextFieldPrecio;

    // Constructor que recibe la Entrada y el Cliente
    public resumenCompraView(Entrada entrada, Cliente cliente) {
        setTitle("Resumen de la Compra");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear el panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2, 10, 10)); // GridLayout para organizar los componentes

        // Crear las etiquetas
        JLabel lblCliente = new JLabel("Cliente:");
        JLabel lblPelicula = new JLabel("Película:");
        JLabel lblSala = new JLabel("Sala:");
        JLabel lblHorario = new JLabel("Horario:");
        JLabel lblAsiento = new JLabel("Asiento:");
        JLabel lblPrecio = new JLabel("Precio:");

        // Crear los JTextField para mostrar la información
        jTextFieldCliente = new JTextField();
        jTextFieldPelicula = new JTextField();
        jTextFieldSala = new JTextField();
        jTextFieldHorario = new JTextField();
        jTextFieldAsiento = new JTextField();
        jTextFieldPrecio = new JTextField();

        // Hacer los JTextField no editables
        jTextFieldCliente.setEditable(false);
        jTextFieldPelicula.setEditable(false);
        jTextFieldSala.setEditable(false);
        jTextFieldHorario.setEditable(false);
        jTextFieldAsiento.setEditable(false);
        jTextFieldPrecio.setEditable(false);

        // Establecer los valores de los JTextField con los datos de la entrada y el cliente
        jTextFieldCliente.setText(cliente.getNombre() + " - " + cliente.getEmail());
        jTextFieldPelicula.setText(entrada.getFuncion().getPelicula().getTitulo());
        jTextFieldSala.setText(String.valueOf(entrada.getFuncion().getSala().getNumero()));
        jTextFieldHorario.setText(entrada.getFuncion().getHorario());
        jTextFieldAsiento.setText(entrada.getAsiento());
        jTextFieldPrecio.setText(String.valueOf(entrada.getPrecio()));

        // Añadir los componentes al panel
        panel.add(lblCliente);
        panel.add(jTextFieldCliente);
        panel.add(lblPelicula);
        panel.add(jTextFieldPelicula);
        panel.add(lblSala);
        panel.add(jTextFieldSala);
        panel.add(lblHorario);
        panel.add(jTextFieldHorario);
        panel.add(lblAsiento);
        panel.add(jTextFieldAsiento);
        panel.add(lblPrecio);
        panel.add(jTextFieldPrecio);

        // Crear el botón de "Cerrar"
        JButton jButtonCerrar = new JButton("Cerrar");
        jButtonCerrar.addActionListener(e -> dispose()); // Al hacer clic, cierra la ventana
        panel.add(jButtonCerrar);

        // Añadir el panel al JFrame
        getContentPane().add(panel);

        // Hacer visible el JFrame
        setVisible(true);
    }
}


