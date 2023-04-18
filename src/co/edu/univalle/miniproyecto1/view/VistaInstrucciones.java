/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.univalle.miniproyecto1.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author julia
 */
public class VistaInstrucciones extends JFrame {
    
    private JLabel lblInstrucciones;
    private JButton btnJugar;
    private JButton btnVolver;
    
    public VistaInstrucciones() {
        
        setTitle("Juego | Fuga de Letras"); // Título de la ventana
        setSize(480, 620); // Tamaño de la ventana
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Permite cerrar la ventana
        inicializarComponentes(); // Inicializa los componentes de la ventana
        setVisible(true);
    }
    
    private void inicializarComponentes() {
        
        lblInstrucciones = new JLabel("Texto de instrucciones Texto de instrucciones Texto de instrucciones Texto de instrucciones",SwingConstants.CENTER);
        lblInstrucciones.setFont(new Font("Arial", Font.BOLD, 18)); // Establece el tamaño y tipo de fuente del título

        ManejadorDeEventos manejadorDeEventos = new ManejadorDeEventos();
        
        btnJugar = new JButton("Jugar");
        btnJugar.setBounds(100,400,30,20);
        btnJugar.addActionListener(manejadorDeEventos);
        
        btnVolver = new JButton("Volver");
        btnVolver.addActionListener(manejadorDeEventos);
        btnVolver.setBounds(100,400,30,20);
        
        add(lblInstrucciones);
        add(btnJugar);
        add(btnVolver);
        
        
        
    }

    private class ManejadorDeEventos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            if(evento.getSource() == btnJugar) {                
                dispose(); 
                VistaParametros ventanaParametros = new VistaParametros();
            }
            else if(evento.getSource() == btnVolver) {
                dispose(); 
                VistaInicio ventanaInicio = new VistaInicio();
            }
        }
    }
    
}
