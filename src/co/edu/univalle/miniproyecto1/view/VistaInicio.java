package co.edu.univalle.miniproyecto1.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaInicio extends JFrame {
    private JPanel jpContenido;
    private JLabel lblIntro;
    private JButton btnJugar;
    private JButton btnInstrucciones;

    public VistaInicio() {

        setTitle("Juego | Fuga de Letras"); // Título de la ventana
        setSize(480, 520); // Tamaño de la ventana
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
        jpContenido.setSize(480,520);        
        jpContenido.setBounds(0,0, 480, 520);
        jpContenido.setLayout(null);
        
        add(jpContenido);
        
        lblIntro = new JLabel("BIENVENIDO A FUGA DE LETRAS",SwingConstants.CENTER);
        lblIntro.setFont(new Font("comic sans ms", Font.BOLD, 20));
        lblIntro.setBounds(0,40, 480,20);
        lblIntro.setForeground(Color.GRAY);
                            
        btnJugar = new JButton("Jugar");
        btnJugar.setFont(new Font("comic sans ms", Font.PLAIN, 16));
        btnJugar.setBounds(160,270, 150,50);
        btnJugar.addActionListener(manejadorDeEventos);
        
        btnInstrucciones = new JButton("Instrucciones");
        btnInstrucciones.setFont(new Font("comic sans ms", Font.PLAIN, 16));
        btnInstrucciones.setBounds(160,330, 150,50);
        btnInstrucciones.addActionListener(manejadorDeEventos);
        
        jpContenido.add(lblIntro);
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