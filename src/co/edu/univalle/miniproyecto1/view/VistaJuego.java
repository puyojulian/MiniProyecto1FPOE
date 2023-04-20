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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * @author julian puyo
 * @author juan david rodriguez
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
    
    private JButton btnTerminar;
    
    private String nombreJugador;
    private String categoria;
    private String palabraAleatoria;
    private int numeroAciertos;
    private int numeroFallos;
    private int palabrasMostradas;
    
    public VistaJuego(String nombreJugador, String categoria) {
        
        setTitle("Juego | Fuga de Letras"); // Título de la ventana
        setSize(480, 520); // Tamaño de la ventana
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setResizable(false);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); // Permite cerrar la ventana
        setVisible(true);
        setLayout(null);
        
        this.nombreJugador = nombreJugador;
        this.categoria = categoria;
        numeroAciertos = 0;
        numeroFallos = 0;
        palabrasMostradas = 0;
        
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
        lblNombreJugador.setForeground(Color.DARK_GRAY);
        lblNombreJugador.setBounds(20,5, 200,20);
        
        lblContadorAciertos = new JLabel("Aciertos: " + numeroAciertos);
        lblContadorAciertos.setFont(new Font("comic sans ms", Font.BOLD, 12));
        lblContadorAciertos.setForeground(Color.DARK_GRAY);
        lblContadorAciertos.setBounds(280,5, 90,20);
        
        lblContadorFallos = new JLabel("Fallos: " + numeroFallos);
        lblContadorFallos.setFont(new Font("comic sans ms", Font.BOLD, 12));
        lblContadorFallos.setForeground(Color.DARK_GRAY);
        lblContadorFallos.setBounds(390,5, 60,20);
        
        lblPalabra = new JLabel(palabraAleatoria,SwingConstants.CENTER);
        lblPalabra.setFont(new Font("comic sans ms", Font.PLAIN, 40));
        lblPalabra.setBounds(0,160, 480,80);
              
        ManejadorDeEventos manejadorDeEventos = new ManejadorDeEventos(juego);
        
        btnA = new JButton("a");
        btnA.setBounds(90,300, 50,50);
        btnA.setFont(new Font("comic sans ms", Font.PLAIN, 20));
        btnA.setBackground(Color.orange);
        btnA.addActionListener(manejadorDeEventos);
        
        btnE = new JButton("e");
        btnE.setBounds(150,320, 50,50);
        btnE.setFont(new Font("comic sans ms", Font.PLAIN, 20));
        btnE.setBackground(Color.cyan);
        btnE.addActionListener(manejadorDeEventos);
        
        btnI = new JButton("i");
        btnI.setBounds(210,300, 50,50);
        btnI.setFont(new Font("comic sans ms", Font.PLAIN, 20));
        btnI.setBackground(Color.yellow);
        btnI.addActionListener(manejadorDeEventos);
        
        btnO = new JButton("o");
        btnO.setBounds(270,320, 50,50);
        btnO.setFont(new Font("comic sans ms", Font.PLAIN, 20));
        btnO.setBackground(Color.GREEN);
        btnO.addActionListener(manejadorDeEventos);
        
        btnU = new JButton("u");
        btnU.setBounds(330,300, 50,50);
        btnU.setFont(new Font("comic sans ms", Font.PLAIN, 20));
        btnU.setBackground(Color.pink);
        btnU.addActionListener(manejadorDeEventos);
        
        btnTerminar = new JButton("Terminar");
        btnTerminar.setBounds(355,430, 80,25);
        btnTerminar.setFont(new Font("comic sans ms", Font.PLAIN, 9));
        btnTerminar.setForeground(Color.ORANGE);
        btnTerminar.setBackground(Color.GRAY);
        btnTerminar.addActionListener(manejadorDeEventos);
        
        jpContenido.add(lblNombreJugador);
        jpContenido.add(lblContadorAciertos);
        jpContenido.add(lblContadorFallos);
        jpContenido.add(lblPalabra);
        jpContenido.add(btnA);
        jpContenido.add(btnE);
        jpContenido.add(btnI);
        jpContenido.add(btnO);
        jpContenido.add(btnU);
        jpContenido.add(btnTerminar);
        
        addWindowListener(new WindowAdapter() {
             @Override
            public void windowClosing(WindowEvent evt) {
                cerrarJuego();
            }
        });
    }
    
    private void cerrarJuego(){
            int respuesta;
            
            respuesta = JOptionPane.showConfirmDialog(
                    null,"¿Esta seguro que no desea terminar?", "Advertencia",
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.WARNING_MESSAGE);
            
            if(respuesta == JOptionPane.YES_OPTION){
                System.exit(0);
            }
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
                    palabraAleatoria = juego.getPalabra();
                    lblPalabra.setText(palabraAleatoria);
                    numeroAciertos = juego.getNumeroAciertos();
                    numeroFallos = juego.getNumeroFallos();
                    lblContadorAciertos.setText("Aciertos: " + numeroAciertos);
                    lblContadorFallos.setText("Fallos: " + numeroFallos);
                    palabrasMostradas += 1;
                }
                else {
                    numeroAciertos = juego.getNumeroAciertos();
                    numeroFallos = juego.getNumeroFallos();
                    lblContadorAciertos.setText("Aciertos: " + numeroAciertos);
                    lblContadorFallos.setText("Fallos: " + numeroFallos);
                    JOptionPane.showMessageDialog(null,
                    "A la palabra " + palabraAleatoria + " no le falta la 'a'. Intenta de nuevo.", 
                    "Vocal Errónea",
                    JOptionPane.ERROR_MESSAGE);
                }
            }
            else if(evento.getSource() == btnE) {
                if(juego.verificarPalabra('e')) {
                    palabraAleatoria = juego.getPalabra();
                    lblPalabra.setText(palabraAleatoria);
                    numeroAciertos = juego.getNumeroAciertos();
                    numeroFallos = juego.getNumeroFallos();
                    lblContadorAciertos.setText("Aciertos: " + numeroAciertos);
                    lblContadorFallos.setText("Fallos: " + numeroFallos);
                    palabrasMostradas += 1;
                }
                else {
                    numeroAciertos = juego.getNumeroAciertos();
                    numeroFallos = juego.getNumeroFallos();
                    lblContadorAciertos.setText("Aciertos: " + numeroAciertos);
                    lblContadorFallos.setText("Fallos: " + numeroFallos);
                    JOptionPane.showMessageDialog(null,
                    "A la palabra " + palabraAleatoria + " no le falta la 'e'. Intenta de nuevo.", 
                    "Vocal Errónea",
                    JOptionPane.ERROR_MESSAGE);
                }
            }
            else if(evento.getSource() == btnI) {
                if(juego.verificarPalabra('i')) {
                    palabraAleatoria = juego.getPalabra();
                    lblPalabra.setText(palabraAleatoria);
                    numeroAciertos = juego.getNumeroAciertos();
                    numeroFallos = juego.getNumeroFallos();
                    lblContadorAciertos.setText("Aciertos: " + numeroAciertos);
                    lblContadorFallos.setText("Fallos: " + numeroFallos);
                    palabrasMostradas += 1;
                }
                else {
                    numeroAciertos = juego.getNumeroAciertos();
                    numeroFallos = juego.getNumeroFallos();
                    lblContadorAciertos.setText("Aciertos: " + numeroAciertos);
                    lblContadorFallos.setText("Fallos: " + numeroFallos);
                    JOptionPane.showMessageDialog(null,
                    "A la palabra " + palabraAleatoria + " no le falta la 'i'. Intenta de nuevo.", 
                    "Vocal Errónea",
                    JOptionPane.ERROR_MESSAGE);
                }
            }
            else if(evento.getSource() == btnO) {
                if(juego.verificarPalabra('o')) {
                    palabraAleatoria = juego.getPalabra();
                    lblPalabra.setText(palabraAleatoria);
                    numeroAciertos = juego.getNumeroAciertos();
                    numeroFallos = juego.getNumeroFallos();
                    lblContadorAciertos.setText("Aciertos: " + numeroAciertos);
                    lblContadorFallos.setText("Fallos: " + numeroFallos);
                    palabrasMostradas += 1;
                }
                else {
                    numeroAciertos = juego.getNumeroAciertos();
                    numeroFallos = juego.getNumeroFallos();
                    lblContadorAciertos.setText("Aciertos: " + numeroAciertos);
                    lblContadorFallos.setText("Fallos: " + numeroFallos);
                    JOptionPane.showMessageDialog(null,
                    "A la palabra " + palabraAleatoria + " no le falta la 'o'. Intenta de nuevo.", 
                    "Vocal Errónea",
                    JOptionPane.ERROR_MESSAGE);
                }
            }
            else if(evento.getSource() == btnU) {
                if(juego.verificarPalabra('u')) {
                    palabraAleatoria = juego.getPalabra();
                    lblPalabra.setText(palabraAleatoria);
                    numeroAciertos = juego.getNumeroAciertos();
                    numeroFallos = juego.getNumeroFallos();
                    lblContadorAciertos.setText("Aciertos: " + numeroAciertos);
                    lblContadorFallos.setText("Fallos: " + numeroFallos);
                    palabrasMostradas += 1;
                }
                else {
                    numeroAciertos = juego.getNumeroAciertos();
                    numeroFallos = juego.getNumeroFallos();
                    lblContadorAciertos.setText("Aciertos: " + numeroAciertos);
                    lblContadorFallos.setText("Fallos: " + numeroFallos);
                    JOptionPane.showMessageDialog(null,
                    "A la palabra " + palabraAleatoria + " no le falta la 'u'. Intenta de nuevo.", 
                    "Vocal Errónea",
                    JOptionPane.ERROR_MESSAGE);
                }
            }
            else if(evento.getSource() == btnTerminar) {
                dispose();
                
                DecimalFormat numberFormat = new DecimalFormat("#0.0");
                
                double numFallos = numeroFallos;
                double numAciertos = numeroAciertos;
                            
                JOptionPane.showMessageDialog(null,
                    "ESTADISTICAS DEL JUEGO\n" + 
                    "\nCantidad de palabras desplegadas: " + palabrasMostradas + 
                    "\nCantidad de fallos: " + numeroFallos + " \n\tPorcentaje de fallo: " + numberFormat.format(numFallos/(numFallos+numAciertos)*100) + "%" + 
                    "\nCantidad de aciertos: " + numeroAciertos + " \n\tPorcentaje: de acierto: " + numberFormat.format(numAciertos/(numFallos+numAciertos)*100) + "%", 
                    "Estadísticas",
                    JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
