package co.edu.univalle.miniproyecto1.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaInicio extends JFrame {
    private JPanel jpContenido;
    private JLabel jlMensaje;
    private JButton btnJugar;
    private JButton btnInstrucciones;

    public VistaInicio() {

        setTitle("Juego | Fuga de Letras"); // Título de la ventana
        setSize(480, 620); // Tamaño de la ventana
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Permite cerrar la ventana
        inicializarComponentes(); // Inicializa los componentes de la ventana
        setLayout(null);
    }

    private void inicializarComponentes() {
        
        ManejadorDeEventos manejadorDeEventos = new ManejadorDeEventos();
        jpContenido = new JPanel();
        jpContenido.setSize(480,620);        
        jpContenido.setBounds(0,0, 480, 620);
        jpContenido.setLayout(null);
        
        add(jpContenido);
        
        jlMensaje = new JLabel("BIENVENIDO A FUGA DE LETRAS",SwingConstants.CENTER);
        jlMensaje.setFont(new Font("arial", Font.BOLD, 20));
        jlMensaje.setBounds(0,10, 480,20);
        jlMensaje.setForeground(Color.GRAY);
                            
        btnJugar = new JButton("Jugar");
        btnJugar.setBounds(165,270, 150,35);
        btnJugar.addActionListener(manejadorDeEventos);
        
        btnInstrucciones = new JButton("Instrucciones");
        btnInstrucciones.setBounds(165,320, 150,35);
        btnInstrucciones.addActionListener(manejadorDeEventos);
        
        jpContenido.add(jlMensaje);
        jpContenido.add(btnJugar);
        jpContenido.add(btnInstrucciones);
    }
    
    class ManejadorDeEventos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento){
            if(evento.getSource() == btnJugar){                
                dispose(); 
                VistaParametros ventanaParametros = new VistaParametros();
            }
            else if(evento.getSource() == btnInstrucciones){                
                dispose(); 
                VistaInstrucciones ventanaInstrucciones = new VistaInstrucciones();
            }
            
        }
    }
}