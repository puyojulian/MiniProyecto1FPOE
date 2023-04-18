package co.edu.univalle.miniproyecto1.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

    private JButton buttonJugar;
    private JButton buttonInstrucciones;

    public Ventana() {
        setTitle("Juego | Fuga de letras"); // Título de la ventana
        setSize(400, 300); // Tamaño de la ventana
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Permite cerrar la ventana
        inicializarComponentes(); // Inicializa los componentes de la ventana
    }

    private void inicializarComponentes() {
        JLabel labelTitulo = new JLabel("Una vocal se ha fugado de la palabra ¿Nos ayudas a encontrarla?");
        labelTitulo.setFont(new Font("Arial", Font.BOLD, 18)); // Establece el tamaño y tipo de fuente del título

        buttonJugar = new JButton("Jugar");
        buttonJugar.addActionListener((ActionEvent e) -> {
            // Acción que se realizará al hacer clic en el botón "Jugar"
        });

        buttonInstrucciones = new JButton("Instrucciones");
        buttonInstrucciones.addActionListener((ActionEvent e) -> {
            // Acción que se realizará al hacer clic en el botón "Instrucciones"
        });

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER)); // Alinea los botones a la derecha del panel
        panelBotones.add(buttonJugar);
        panelBotones.add(buttonInstrucciones);

        add(labelTitulo, BorderLayout.NORTH); // Añade el título en la parte superior de la ventana
        add(panelBotones, BorderLayout.SOUTH); // Añade los botones en la parte inferior de la ventana
    }

    public static void main(String[] args) {
        Ventana ventana = new Ventana(); // Crea un objeto de la clase Ventana
        ventana.setVisible(true); // Muestra la ventana
    }
}