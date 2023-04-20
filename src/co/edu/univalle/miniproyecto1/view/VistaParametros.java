/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.univalle.miniproyecto1.view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import co.edu.univalle.miniproyecto1.logic.Juego;
import co.edu.univalle.miniproyecto1.model.Jugador;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
/**
 *
 * @author julia
 */
public class VistaParametros extends JFrame{
    
    private JPanel jpContenido;
    
    private JLabel lblNombre;
    private JTextField txtNombre;
    
    private JLabel lblCategoria;
    private JToggleButton btnCatAnimales;
    private JToggleButton btnCatColores;
    private JToggleButton btnCatFrutas;
    private JButton btnConfirmar;

    public VistaParametros() {
        
        setTitle("Juego | Fuga de Letras"); // Título de la ventana
        setSize(480, 520); // Tamaño de la ventana
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Permite cerrar la ventana
        inicializarComponentes(); // Inicializa los componentes de la ventana
        setVisible(true);
        setResizable(false);
        setLayout(null);
    }

    private void inicializarComponentes() {
        
        jpContenido = new JPanel();
        jpContenido.setSize(480, 580);
        jpContenido.setBounds(0,0,480,580);
        jpContenido.setLayout(null);
        jpContenido.setBackground(Color.LIGHT_GRAY);
        
        add(jpContenido);
        
        lblNombre = new JLabel("Escribe tu nombre",SwingConstants.CENTER);
        lblNombre.setFont(new Font("comic sans ms", Font.PLAIN, 20));
        lblNombre.setBounds(0,100, 480,20);
   
        txtNombre = new JTextField();
        txtNombre.setHorizontalAlignment(JTextField.CENTER);
        txtNombre.setForeground(Color.CYAN);
        txtNombre.setBackground(Color.GRAY);
        txtNombre.setFont(new Font("comic sans ms", Font.PLAIN, 16));
        txtNombre.setBounds(90,150, 300,30);
        
        lblCategoria = new JLabel("Escoje tu categoria",SwingConstants.CENTER);
        lblCategoria.setFont(new Font("comic sans ms", Font.PLAIN, 20));
        lblCategoria.setBounds(0,250, 480,30);
        
        ManejadorDeEventos manejadorDeEventos = new ManejadorDeEventos();
        
        btnCatAnimales = new JToggleButton("Animales");
        btnCatAnimales.setBounds(90,300, 100,35);
        btnCatAnimales.setFont(new Font("comic sans ms", Font.PLAIN, 14));
        btnCatAnimales.addActionListener(manejadorDeEventos);
        
        btnCatColores = new JToggleButton("Colores");
        btnCatColores.setBounds(190,300, 100,35);
        btnCatColores.setFont(new Font("comic sans ms", Font.PLAIN, 14));
        btnCatColores.addActionListener(manejadorDeEventos);
        
        btnCatFrutas = new JToggleButton("Frutas");
        btnCatFrutas.setBounds(290,300, 100,35);
        btnCatFrutas.setFont(new Font("comic sans ms", Font.PLAIN, 14));
        btnCatFrutas.addActionListener(manejadorDeEventos);
        
        btnConfirmar = new JButton("Confirmar");
        btnConfirmar.setBounds(180,370, 120,35);
        btnConfirmar.setFont(new Font("comic sans ms", Font.PLAIN, 14));
        btnConfirmar.addActionListener(manejadorDeEventos);
        
        jpContenido.add(lblNombre);
        jpContenido.add(txtNombre);
        jpContenido.add(lblCategoria);
        jpContenido.add(btnCatAnimales);
        jpContenido.add(btnCatColores);
        jpContenido.add(btnCatFrutas);
        jpContenido.add(btnConfirmar);
    }
    
    private class ManejadorDeEventos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
            if(evento.getSource() == btnCatAnimales) {                
                btnCatColores.setSelected(false);
                btnCatFrutas.setSelected(false);
            }
            else if(evento.getSource() == btnCatColores) {
                btnCatAnimales.setSelected(false);
                btnCatFrutas.setSelected(false);
            }
            else if(evento.getSource() == btnCatFrutas) {                
                btnCatAnimales.setSelected(false);
                btnCatColores.setSelected(false);
            }
            if(evento.getSource() == btnConfirmar) {
                if(btnCatAnimales.isSelected()) {
                    dispose();
                    VistaJuego vistaJuego = new VistaJuego(txtNombre.getText(),"animales");
                }
                else if(btnCatColores.isSelected()) {
                    dispose();
                    VistaJuego vistaJuego = new VistaJuego(txtNombre.getText(),"colores");
                }
                else if(btnCatFrutas.isSelected()) {
                    dispose();
                    VistaJuego vistaJuego = new VistaJuego(txtNombre.getText(),"frutas");
                }
                else {
                    JOptionPane.showMessageDialog(null,
                    "Selecciona una categoría.", 
                    "Parámetro Necesario",
                    JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
}
