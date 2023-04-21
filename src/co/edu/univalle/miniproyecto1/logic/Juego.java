/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.univalle.miniproyecto1.logic;

import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;


/**
 *
 * @author julia
 */
public class Juego {
    
    private String palabrasCompletasAnimales[]; 
    private String palabrasCompletasFrutas[];
    private String palabrasCompletasColores[];
    
    private String palabrasIncompletasAnimales[]; 
    private String palabrasIncompletasFrutas[];
    private String palabrasIncompletasColores[];
    
    private String dirImagenesPalabrasAnimales[];
    private String dirImagenesPalabrasFrutas[];
    private String dirImagenesPalabrasColores[];
    
    private String dirImagen;
    
    private Icon imagen;
    
    private int numeroAciertos;
    private int numeroFallos;
    private int indiceTemporal;
    private String categoria;
    
    public Juego(String categoria) {
        
        palabrasCompletasAnimales = new String[] {"León", "Canguro", "Tigre", "Koala", "Perro", "Gato", "Elefante", "Ballena", "Zorro", "Cocodrilo", "Burro", "Caballo", "Serpiente", "Iguana", "Sapo"};
        palabrasCompletasFrutas = new String[] {"Manzana", "Pera", "Uva", "Kiwi", "Arándano", "Cereza", "Aguacate", "Banano", "Piña", "Melón", "Guayaba", "Papaya", "Lulo", "Naranja", "Limón"};
        palabrasCompletasColores = new String[] {"Amarillo", "Azul", "Rojo", "Negro", "Naranja", "Verde", "Rosado", "Marrón", "Blanco", "Violeta", "Gris", "Magenta", "Cian", "Púrpura","Celeste"};
        
        palabrasIncompletasAnimales = new String[] {"L_ón", "Cang_ro", "T_gre", "K_ala", "P_rro", "G_to", "Elef_nte", "B_llena", "Zorr_", "Coc_drilo", "Burr_", "Cab_llo", "Serp_ente", "Ig_ana", "S_po"};
        palabrasIncompletasFrutas = new String[] {"Manz_na", "P_ra", "Uv_", "Kiw_", "Aránd_no", "C_reza", "Aguac_te", "Banan_", "P_ña", "M_lón", "Gu_yaba", "Pap_ya", "L_lo", "N_ranja", "L_món"};
        palabrasIncompletasColores = new String[] {"Amarill_", "Az_l", "R_jo", "N_gro", "Nar_nja", "V_rde", "R_sado", "M_rrón", "Blanc_", "Vi_leta", "Gr_s", "Mag_nta", "Ci_n", "Púrp_ra","Celest_"};
        
        dirImagenesPalabrasAnimales = new String[] {"/co/edu/univalle/miniproyecto1/img/animales0.png","/co/edu/univalle/miniproyecto1/img/animales1.png","/co/edu/univalle/miniproyecto1/img/animales2.png","/co/edu/univalle/miniproyecto1/img/animales3.png","/co/edu/univalle/miniproyecto1/img/animales4.png","/co/edu/univalle/miniproyecto1/img/animales5.png","/co/edu/univalle/miniproyecto1/img/animales6.png","/co/edu/univalle/miniproyecto1/img/animales7.png","/co/edu/univalle/miniproyecto1/img/animales8.png","/co/edu/univalle/miniproyecto1/img/animales9.png","/co/edu/univalle/miniproyecto1/img/animales10.png","/co/edu/univalle/miniproyecto1/img/animales11.png","/co/edu/univalle/miniproyecto1/img/animales12.png","/co/edu/univalle/miniproyecto1/img/animales13.png","/co/edu/univalle/miniproyecto1/img/animales14.png"};
        dirImagenesPalabrasFrutas = new String[] {"/co/edu/univalle/miniproyecto1/img/frutas0.png","/co/edu/univalle/miniproyecto1/img/frutas1.png","/co/edu/univalle/miniproyecto1/img/frutas2.png","/co/edu/univalle/miniproyecto1/img/frutas3.png","/co/edu/univalle/miniproyecto1/img/frutas4.png","/co/edu/univalle/miniproyecto1/img/frutas5.png","/co/edu/univalle/miniproyecto1/img/frutas6.png","/co/edu/univalle/miniproyecto1/img/frutas7.png","/co/edu/univalle/miniproyecto1/img/frutas8.png","/co/edu/univalle/miniproyecto1/img/frutas9.png","/co/edu/univalle/miniproyecto1/img/frutas10.png","/co/edu/univalle/miniproyecto1/img/frutas11.png","/co/edu/univalle/miniproyecto1/img/frutas12.png","/co/edu/univalle/miniproyecto1/img/frutas13.png","/co/edu/univalle/miniproyecto1/img/frutas14.png"};
        dirImagenesPalabrasColores = new String[] {"/co/edu/univalle/miniproyecto1/img/colores0.png","/co/edu/univalle/miniproyecto1/img/colores1.png","/co/edu/univalle/miniproyecto1/img/colores2.png","/co/edu/univalle/miniproyecto1/img/colores3.png","/co/edu/univalle/miniproyecto1/img/colores4.png","/co/edu/univalle/miniproyecto1/img/colores5.png","/co/edu/univalle/miniproyecto1/img/colores6.png","/co/edu/univalle/miniproyecto1/img/colores7.png","/co/edu/univalle/miniproyecto1/img/colores8.png","/co/edu/univalle/miniproyecto1/img/colores9.png","/co/edu/univalle/miniproyecto1/img/colores10.png","/co/edu/univalle/miniproyecto1/img/colores11.png","/co/edu/univalle/miniproyecto1/img/colores12.png","/co/edu/univalle/miniproyecto1/img/colores13.png","/co/edu/univalle/miniproyecto1/img/colores14.png"};
        
        this.categoria = categoria;
        numeroAciertos = 0;
        numeroFallos = 0;
        indiceTemporal = 0;
    }
    
    public String getPalabra() {

        Random random = new Random();
        int indiceAleatorio = random.nextInt(15);
        
        indiceTemporal = indiceAleatorio;
        
        if(categoria == "animales") {
            dirImagen = palabrasIncompletasAnimales[indiceTemporal];
            return dirImagen;
        }
        else if(categoria == "frutas") {
            dirImagen = palabrasIncompletasFrutas[indiceTemporal];
            return dirImagen;
        }
        else if(categoria == "colores") {
            dirImagen = palabrasIncompletasColores[indiceTemporal];
            return dirImagen;
        }
        return null;
    }
    
    public String getDirImagen() {
        if(categoria == "animales") {
            dirImagen = dirImagenesPalabrasAnimales[indiceTemporal];
            return dirImagen;
        }
        else if(categoria == "frutas") {
            dirImagen = dirImagenesPalabrasFrutas[indiceTemporal];
            return dirImagen;
        }
        else if(categoria == "colores") {
            dirImagen = dirImagenesPalabrasColores[indiceTemporal];
            return dirImagen;
        }
        else {
            return null;
        }
    }
    
    public Icon getImagen() {
        this.getDirImagen();
        imagen = new ImageIcon(new ImageIcon(getClass().getResource(dirImagen)).getImage()
                .getScaledInstance(128,128,0)); 
        return imagen;
    }
    
    public boolean verificarPalabra(char vocal) {
        
        String palabraPorComparar;
        
        if(categoria == "animales") {
            palabraPorComparar = palabrasIncompletasAnimales[indiceTemporal];
            String replace = palabraPorComparar.replace('_', vocal);
            
            if(palabrasCompletasAnimales[indiceTemporal].equals(replace)) {
                numeroAciertos += 1;
                return true;
            }
            else {
                numeroFallos += 1;
                return false;
            }
        }
        else if(categoria == "frutas") {
            palabraPorComparar = palabrasIncompletasFrutas[indiceTemporal];
            String replace = palabraPorComparar.replace('_', vocal);
            
            if(palabrasCompletasFrutas[indiceTemporal].equals(replace)) {
                numeroAciertos += 1;
                return true;
            }
            else {
                numeroFallos += 1;
                return false;
            }
        }
        else if(categoria == "colores") {
            palabraPorComparar = palabrasIncompletasColores[indiceTemporal];
            String replace = palabraPorComparar.replace('_', vocal);
            
            if(palabrasCompletasColores[indiceTemporal].equals(replace)) {
                numeroAciertos += 1;
                return true;
            }
            else {
                numeroFallos += 1;
                return false;
            }
        }
        else {
            return false;
        }
    }

    public int getNumeroAciertos() {
        return numeroAciertos;
    }

    public int getNumeroFallos() {
        return numeroFallos;
    }
}
