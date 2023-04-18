package co.edu.univalle.miniproyecto1.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaInicio extends JFrame {

    private JLabel lblIntro;
    private JButton btnJugar;
    private JButton btnInstrucciones;

    public VistaInicio() {
        setTitle("Juego | Fuga de Letras"); // Título de la ventana
        setSize(480, 620); // Tamaño de la ventana
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Permite cerrar la ventana
        inicializarComponentes(); // Inicializa los componentes de la ventana
        setVisible(true);
    }

    private void inicializarComponentes() {
        
        lblIntro = new JLabel("Una vocal se ha fugado de la palabra ¿Nos ayudas a encontrarla?",SwingConstants.CENTER);
        lblIntro.setFont(new Font("Arial", Font.BOLD, 18)); // Establece el tamaño y tipo de fuente del título

        ManejadorDeEventos manejadorDeEventos = new ManejadorDeEventos();
        
        btnJugar = new JButton("Jugar");
        btnJugar.addActionListener(manejadorDeEventos);

        btnInstrucciones = new JButton("Instrucciones");
        btnInstrucciones.addActionListener(manejadorDeEventos);

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER)); // Alinea los botones a la derecha del panel
        panelBotones.add(btnJugar);
        panelBotones.add(btnInstrucciones);

        add(lblIntro, BorderLayout.NORTH); // Añade el título en la parte superior de la ventana
        add(panelBotones, BorderLayout.CENTER); // Añade los botones en la parte central de la ventana   
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