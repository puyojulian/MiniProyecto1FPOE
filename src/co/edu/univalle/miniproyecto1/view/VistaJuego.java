/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.univalle.miniproyecto1.view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author julia
 */
public class VistaJuego extends JFrame {
    
    private JPanel jpContenido;
    
    private JLabel lblPalabra;
    private JLabel lblNombreJugador;
    private JLabel lblContadorAciertos;
    private JLabel lblContadorFallos;
    
    private JButton btnA;
    private JButton btnE;
    private JButton btnI;
    private JButton btnO;
    private JButton btnU;
    
    private String nombreJugador;
    private int numeroAciertos;
    private int numeroFallos;
    
    public VistaJuego() {
        
        setTitle("Juego | Fuga de Letras"); // Título de la ventana
        setSize(480, 520); // Tamaño de la ventana
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Permite cerrar la ventana
        inicializarComponentes(); // Inicializa los componentes de la ventana
        setVisible(true);
        setLayout(null);
        
        nombreJugador = "Anónimo";
        numeroAciertos = 0;
        numeroFallos = 0;
        
    }

    private void inicializarComponentes() {
        jpContenido = new JPanel();
        jpContenido.setSize(480, 580);
        jpContenido.setBounds(0,0,480,580);
        jpContenido.setLayout(null);
        jpContenido.setBackground(Color.LIGHT_GRAY);
        
        add(jpContenido);
        
        lblNombreJugador = new JLabel("Nombre: " + nombreJugador);
        lblNombreJugador.setFont(new Font("comic sans ms", Font.BOLD, 12));
        lblNombreJugador.setBounds(20,5, 120,20);
        
        lblContadorAciertos = new JLabel("Aciertos: " + numeroAciertos);
        lblContadorAciertos.setFont(new Font("comic sans ms", Font.BOLD, 12));
        lblContadorAciertos.setBounds(290,5, 80,20);
        
        lblContadorFallos = new JLabel("Fallos: " + numeroFallos);
        lblContadorFallos.setFont(new Font("comic sans ms", Font.BOLD, 12));
        lblContadorFallos.setBounds(400,5, 60,20);
        
        lblPalabra = new JLabel("Pal_bra",SwingConstants.CENTER);
        lblPalabra.setFont(new Font("comic sans ms", Font.PLAIN, 40));
        lblPalabra.setBounds(0,160, 480,50);
              
        ManejadorDeEventos manejadorDeEventos = new ManejadorDeEventos();
        
        btnA = new JButton("a");
        btnA.setBounds(90,300, 50,50);
        btnA.setFont(new Font("comic sans ms", Font.PLAIN, 20));
        btnA.addActionListener(manejadorDeEventos);
        
        btnE = new JButton("e");
        btnE.setBounds(150,320, 50,50);
        btnE.setFont(new Font("comic sans ms", Font.PLAIN, 20));
        btnE.addActionListener(manejadorDeEventos);
        
        btnI = new JButton("i");
        btnI.setBounds(210,300, 50,50);
        btnI.setFont(new Font("comic sans ms", Font.PLAIN, 20));
        btnI.addActionListener(manejadorDeEventos);
        
        btnO = new JButton("o");
        btnO.setBounds(270,320, 50,50);
        btnO.setFont(new Font("comic sans ms", Font.PLAIN, 20));
        btnO.addActionListener(manejadorDeEventos);
        
        btnU = new JButton("u");
        btnU.setBounds(330,300, 50,50);
        btnU.setFont(new Font("comic sans ms", Font.PLAIN, 20));
        btnU.addActionListener(manejadorDeEventos);
        
        jpContenido.add(lblNombreJugador);
        jpContenido.add(lblContadorAciertos);
        jpContenido.add(lblContadorFallos);
        jpContenido.add(lblPalabra);
        jpContenido.add(btnA);
        jpContenido.add(btnE);
        jpContenido.add(btnI);
        jpContenido.add(btnO);
        jpContenido.add(btnU);
    }
    
    private class ManejadorDeEventos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            if(evento.getSource() == btnA) {                

            }
            else if(evento.getSource() == btnE) {

            }
            else if(evento.getSource() == btnI) {                

            }
            else if(evento.getSource() == btnO) {

            }
            else if(evento.getSource() == btnU) {

            }
        }
    }

}
