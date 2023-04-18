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
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
/**
 *
 * @author julia
 */
public class VistaParametros extends JFrame{
    private JLabel lblNombre;
    private JTextField txtNombre;
    
    private JLabel lblCategoria;
    private JButton btnCatAnimales;
    private JButton btnCatColores;
    private JButton btnCatFrutas;
    private JButton btnConfirmar;
    private Container mainContainer;
    private JPanel panelBotones;
    
    public VistaParametros() {
        setTitle("Juego | Fuga de Letras"); // Título de la ventana
        setSize(480, 620); // Tamaño de la ventana
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Permite cerrar la ventana
        inicializarComponentes(); // Inicializa los componentes de la ventana
        setVisible(true);
    }

    private void inicializarComponentes() {
        lblNombre = new JLabel("Escriba su nombre",SwingConstants.CENTER);
        lblNombre.setFont(new Font("arial", Font.BOLD, 20));
   
        txtNombre = new JTextField();
        txtNombre.setHorizontalAlignment(JTextField.CENTER);
        txtNombre.setForeground(Color.GRAY);
        txtNombre.setFont(new Font("arial", Font.PLAIN, 20));
        
        lblCategoria = new JLabel("Escoja su categoria",SwingConstants.CENTER);
        lblCategoria.setFont(new Font("arial", Font.BOLD, 20));
        
        btnCatAnimales = new JButton("Animales");
        btnCatColores = new JButton("Colores");
        btnCatFrutas = new JButton("Frutas");
        
        btnConfirmar = new JButton("Confirmar");
        
        mainContainer = getContentPane();
        
        mainContainer.setLayout(new GridLayout(5,1,5,100));
        
        panelBotones = new JPanel();
        
        panelBotones.setLayout(new GridLayout(1,3,5,5));
        
        panelBotones.add(btnCatAnimales);
        panelBotones.add(btnCatColores);
        panelBotones.add(btnCatFrutas);
        
        mainContainer.add(lblNombre);
        mainContainer.add(txtNombre);
        mainContainer.add(lblCategoria);
        mainContainer.add(panelBotones);
        mainContainer.add(btnConfirmar);
    }
}
