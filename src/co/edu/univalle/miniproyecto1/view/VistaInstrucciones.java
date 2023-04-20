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
    
    private JPanel jpContenido;
    private JLabel lblInstrucciones;
    private JButton btnJugar;
    private JButton btnVolver;
    
    public VistaInstrucciones() {
        
        setTitle("Juego | Fuga de Letras");
        setSize(480, 520);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        inicializarComponentes();
        setVisible(true);
        setLayout(null);
    }
    
    private void inicializarComponentes() {
        
        jpContenido = new JPanel();
        jpContenido.setSize(480,520);        
        jpContenido.setBounds(0,0, 480, 520);
        jpContenido.setLayout(null);
        jpContenido.setBackground(Color.lightGray);
        
        add(jpContenido);
        
        lblInstrucciones = new JLabel("<html><p style=width:200px>" + "A la palabra que te damos le falta una vocal, presiónala." + "</p></html>",SwingConstants.CENTER);
        lblInstrucciones.setFont(new Font("comic sans ms", Font.PLAIN, 20));
        lblInstrucciones.setBounds(0,0,480,300);
        lblInstrucciones.setForeground(Color.DARK_GRAY);
        
        
        ManejadorDeEventos manejadorDeEventos = new ManejadorDeEventos();
        
        btnJugar = new JButton("Jugar");
        btnJugar.setBounds(160,270, 150,50);
        btnJugar.setFont(new Font("comic sans ms", Font.PLAIN, 16));
        btnJugar.addActionListener(manejadorDeEventos);
        
        btnVolver = new JButton("Volver");
        btnVolver.addActionListener(manejadorDeEventos);
        btnVolver.setFont(new Font("comic sans ms", Font.PLAIN, 16));
        btnVolver.setBounds(160,330, 150,50);
        
        jpContenido.add(lblInstrucciones);
        jpContenido.add(btnJugar);
        jpContenido.add(btnVolver);   
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
