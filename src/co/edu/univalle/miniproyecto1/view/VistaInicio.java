/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.univalle.miniproyecto1.view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import co.edu.univalle.miniproyecto1.view.VistaInstrucciones;


/**
 *
 * @author julia
 */
public class VistaInicio extends JFrame {
    
    private JLabel lblIntro;
    private JButton btnJugar;
    private JButton btnInstrucciones;
    private Container mainContainer;
    private JPanel panelBotones;
    
    public VistaInicio() {
        initComponents();
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Juego de Letras");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setLayout(new BorderLayout());
    }
    
    public void initComponents() {
        lblIntro = new JLabel("Quieres saber si eres un maestro en el arte de adivinar palabras. Completa las palabras rellenando la vocal faltante.");
        
        panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(2,1,10,10));
        
        btnJugar = new JButton("Jugar");
        btnInstrucciones = new JButton("Instrucciones");
        
        mainContainer = new Container();
        mainContainer = getContentPane();
        
        panelBotones.add(btnJugar);
        panelBotones.add(btnInstrucciones);
        
        mainContainer.add(lblIntro, BorderLayout.NORTH);
        mainContainer.add(panelBotones,BorderLayout.CENTER);
    }
    
}
