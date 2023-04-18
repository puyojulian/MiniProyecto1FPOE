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
    private Container mainContainer;
    
    public VistaInstrucciones() {
        
        setTitle("Juego | Fuga de Letras"); // Título de la ventana
        setSize(480, 520); // Tamaño de la ventana
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Permite cerrar la ventana
        inicializarComponentes(); // Inicializa los componentes de la ventana
        setVisible(true);
    }
    
    private void inicializarComponentes() {
        
        getContentPane().setLayout(null);
        
        lblInstrucciones = new JLabel("<HTML>Texto de instrucciones Texto de instrucciones Texto de instrucciones Texto de instrucciones Texto Inst<HTML>",SwingConstants.CENTER);
        lblInstrucciones.setHorizontalAlignment(JLabel.CENTER);
        lblInstrucciones.setFont(new Font("Arial", Font.BOLD, 16)); // Establece el tamaño y tipo de fuente del título
        lblInstrucciones.setSize(240,100);
        lblInstrucciones.setBounds(10,100,400,100);

        ManejadorDeEventos manejadorDeEventos = new ManejadorDeEventos();
        
        btnJugar = new JButton("Jugar");
        btnJugar.setBounds(190,300,100,40);
        btnJugar.addActionListener(manejadorDeEventos);
        
        btnVolver = new JButton("Volver");
        btnVolver.addActionListener(manejadorDeEventos);
        btnVolver.setBounds(190,380,100,40);
        
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
