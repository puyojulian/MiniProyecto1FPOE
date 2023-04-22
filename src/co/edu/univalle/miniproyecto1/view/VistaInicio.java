package co.edu.univalle.miniproyecto1.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * @author Julian Puyo
 * @author Juan David Rodriguez
 */
public class VistaInicio extends JFrame {
    private JPanel jpContenido;
    private JLabel lblIntro;
    private JLabel lblIntro2;
    private JButton btnJugar;
    private JButton btnInstrucciones;

    public VistaInicio() {

        setTitle("Juego | Fuga de Letras");
        setSize(480, 520);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        inicializarComponentes();
        setLayout(null);
    }

    private void inicializarComponentes() {
        
        ManejadorDeEventos manejadorDeEventos = new ManejadorDeEventos();
        
        jpContenido = new JPanel();
        jpContenido.setSize(480,520);        
        jpContenido.setBounds(0,0, 480, 520);
        jpContenido.setLayout(null);
        jpContenido.setBackground(Color.DARK_GRAY);
        
        add(jpContenido);
        
        lblIntro = new JLabel("Una vocal se ha fugado de la palabra",SwingConstants.CENTER);
        lblIntro.setFont(new Font("comic sans ms", Font.BOLD, 22));
        lblIntro.setBounds(0,100, 470,30);
        lblIntro.setForeground(Color.WHITE);
        
        lblIntro2 = new JLabel("¿Nos ayudas a encontrarla?",SwingConstants.CENTER);
        lblIntro2.setFont(new Font("comic sans ms", Font.BOLD, 26));
        lblIntro2.setBounds(0,160, 470,40);
        lblIntro2.setForeground(Color.CYAN);
                            
        btnJugar = new JButton("Jugar");
        btnJugar.setFont(new Font("comic sans ms", Font.PLAIN, 16));
        btnJugar.setBounds(160,270, 150,50);
        btnJugar.setForeground(Color.DARK_GRAY);
        btnJugar.setBackground(new Color(252,169,133));
        btnJugar.addActionListener(manejadorDeEventos);
        
        btnInstrucciones = new JButton("Instrucciones");
        btnInstrucciones.setFont(new Font("comic sans ms", Font.PLAIN, 16));
        btnInstrucciones.setBounds(160,330, 150,50);
        btnInstrucciones.setForeground(Color.DARK_GRAY);
        btnInstrucciones.setBackground(new Color(134,207,190));
        btnInstrucciones.addActionListener(manejadorDeEventos);
        
        jpContenido.add(lblIntro);
        jpContenido.add(lblIntro2);
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