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
        inicializarComponentes(); // Inicializa los componentes de la ventana
    }

    private void inicializarComponentes() {
        setTitle("Juego | Fuga de Letras"); // Título de la ventana
        setSize(600,530); // Tamaño de la ventana
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Permite cerrar la ventana
        setVisible(true);
        setResizable(false);
        setLayout(null);
        
        ManejadorDeEventos manejadorDeEventos = new ManejadorDeEventos();
        jpContenido = new JPanel();
        
        jlMensaje = new JLabel("BIENVENIDO A FUGA DE LETRAS",SwingConstants.CENTER);
        
        jpContenido.setSize(600,515);        
        jpContenido.setBounds(0,130, 600, 515);
        jpContenido.setLayout(null);
        
        add(jpContenido);
        
        jlMensaje.setBounds(0,0, 600,20);
        jlMensaje.setForeground(Color.GRAY);
        jlMensaje.setFont(new Font("arial", Font.BOLD, 20));
        
        btnJugar = new JButton("Jugar");
        btnJugar.setBounds(180,270, 150,35);
        btnJugar.addActionListener(manejadorDeEventos);
        
        jpContenido.add(jlMensaje);
        jpContenido.add(btnJugar);

        //btnInstrucciones = new JButton("Instrucciones");
        //btnInstrucciones.addActionListener(manejadorDeEventos);

        //JPanel panelBotones = new JPanel();
       // panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER)); // Alinea los botones a la derecha del panel
        //panelBotones.add(btnJugar);
        //panelBotones.add(btnInstrucciones);

        //add(jlMensaje, BorderLayout.NORTH); // Añade el título en la parte superior de la ventana
        //add(panelBotones, BorderLayout.CENTER); // Añade los botones en la parte central de la ventana   
    }
    
    class ManejadorDeEventos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento){
            if(evento.getSource() == btnJugar){                
                dispose(); 
                VistaParametros ventanaParametros = new VistaParametros();
            }
            
        }
    }
}