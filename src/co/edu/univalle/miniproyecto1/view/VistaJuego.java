/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.univalle.miniproyecto1.view;

import co.edu.univalle.miniproyecto1.logic.Juego;
import co.edu.univalle.miniproyecto1.model.Jugador;
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
    
    private static Juego juego;
    
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
    private String categoria;
    private String palabraAleatoria;
    private int numeroAciertos;
    private int numeroFallos;
    
    public VistaJuego(String nombreJugador, String categoria) {
        
        setTitle("Juego | Fuga de Letras"); // Título de la ventana
        setSize(480, 520); // Tamaño de la ventana
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Permite cerrar la ventana
        setVisible(true);
        setLayout(null);
        
        this.nombreJugador = nombreJugador;
        this.categoria = categoria;
        numeroAciertos = 0;
        numeroFallos = 0;
        
        Jugador jugador = new Jugador(nombreJugador);
        juego = new Juego(categoria);
        palabraAleatoria = juego.getPalabra();
        
        inicializarComponentes(juego);
    }

    private void inicializarComponentes(Juego juego) {
        jpContenido = new JPanel();
        jpContenido.setSize(480, 580);
        jpContenido.setBounds(0,0,480,580);
        jpContenido.setLayout(null);
        jpContenido.setBackground(Color.LIGHT_GRAY);
        
        add(jpContenido);
        
        lblNombreJugador = new JLabel("Nombre: " + nombreJugador);
        lblNombreJugador.setFont(new Font("comic sans ms", Font.BOLD, 12));
        lblNombreJugador.setBounds(20,5, 200,20);
        
        lblContadorAciertos = new JLabel("Aciertos: " + numeroAciertos);
        lblContadorAciertos.setFont(new Font("comic sans ms", Font.BOLD, 12));
        lblContadorAciertos.setBounds(290,5, 80,20);
        
        lblContadorFallos = new JLabel("Fallos: " + numeroFallos);
        lblContadorFallos.setFont(new Font("comic sans ms", Font.BOLD, 12));
        lblContadorFallos.setBounds(390,5, 60,20);
        
        lblPalabra = new JLabel(palabraAleatoria,SwingConstants.CENTER);
        lblPalabra.setFont(new Font("comic sans ms", Font.PLAIN, 40));
        lblPalabra.setBounds(0,160, 480,80);
              
        ManejadorDeEventos manejadorDeEventos = new ManejadorDeEventos(juego);
        
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
        private Juego juego;       
        
        public ManejadorDeEventos(Juego juego) {
            this.juego = juego;
        }

        @Override
        public void actionPerformed(ActionEvent evento) {            
            if(evento.getSource() == btnA) {
                if(juego.verificarPalabra('a')) {
                    lblPalabra.setText(juego.getPalabra());
                    numeroAciertos = juego.getNumeroAciertos();
                    numeroFallos = juego.getNumeroFallos();
                    lblContadorAciertos.setText("Aciertos: " + numeroAciertos);
                    lblContadorFallos.setText("Fallos: " + numeroFallos);
                }
                else {
                    numeroAciertos = juego.getNumeroAciertos();
                    numeroFallos = juego.getNumeroFallos();
                    lblContadorAciertos.setText("Aciertos: " + numeroAciertos);
                    lblContadorFallos.setText("Fallos: " + numeroFallos);
                }
            }
            else if(evento.getSource() == btnE) {
                if(juego.verificarPalabra('e')) {
                    lblPalabra.setText(juego.getPalabra());
                    numeroAciertos = juego.getNumeroAciertos();
                    numeroFallos = juego.getNumeroFallos();
                    lblContadorAciertos.setText("Aciertos: " + numeroAciertos);
                    lblContadorFallos.setText("Fallos: " + numeroFallos);
                }
                else {
                    numeroAciertos = juego.getNumeroAciertos();
                    numeroFallos = juego.getNumeroFallos();
                    lblContadorAciertos.setText("Aciertos: " + numeroAciertos);
                    lblContadorFallos.setText("Fallos: " + numeroFallos);
                }
            }
            else if(evento.getSource() == btnI) {
                if(juego.verificarPalabra('i')) {
                    lblPalabra.setText(juego.getPalabra());
                    numeroAciertos = juego.getNumeroAciertos();
                    numeroFallos = juego.getNumeroFallos();
                    lblContadorAciertos.setText("Aciertos: " + numeroAciertos);
                    lblContadorFallos.setText("Fallos: " + numeroFallos);
                }
                else {
                    numeroAciertos = juego.getNumeroAciertos();
                    numeroFallos = juego.getNumeroFallos();
                    lblContadorAciertos.setText("Aciertos: " + numeroAciertos);
                    lblContadorFallos.setText("Fallos: " + numeroFallos);
                }
            }
            else if(evento.getSource() == btnO) {
                if(juego.verificarPalabra('o')) {
                    lblPalabra.setText(juego.getPalabra());
                    numeroAciertos = juego.getNumeroAciertos();
                    numeroFallos = juego.getNumeroFallos();
                    lblContadorAciertos.setText("Aciertos: " + numeroAciertos);
                    lblContadorFallos.setText("Fallos: " + numeroFallos);
                }
                else {
                    numeroAciertos = juego.getNumeroAciertos();
                    numeroFallos = juego.getNumeroFallos();
                    lblContadorAciertos.setText("Aciertos: " + numeroAciertos);
                    lblContadorFallos.setText("Fallos: " + numeroFallos);
                }
            }
            else if(evento.getSource() == btnU) {
                if(juego.verificarPalabra('u')) {
                    lblPalabra.setText(juego.getPalabra());
                    numeroAciertos = juego.getNumeroAciertos();
                    numeroFallos = juego.getNumeroFallos();
                    lblContadorAciertos.setText("Aciertos: " + numeroAciertos);
                    lblContadorFallos.setText("Fallos: " + numeroFallos);
                }
                else {
                    numeroAciertos = juego.getNumeroAciertos();
                    numeroFallos = juego.getNumeroFallos();
                    lblContadorAciertos.setText("Aciertos: " + numeroAciertos);
                    lblContadorFallos.setText("Fallos: " + numeroFallos);
                }
            }
        }
    }

}
