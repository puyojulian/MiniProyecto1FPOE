/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.univalle.miniproyecto1.logic;


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
    
    private int numeroAciertos;
    private int numeroFallos;
    private String categoria;
    
    public Juego(String categoria) {
        
        palabrasCompletasAnimales = new String [] {"Leon", "Canguro", "Tigre", "Koala", "Perro", "Gato", "Elefante", "Ballena", "Zorro", "Cocodrilo", "Burro", "Caballo", "Serpiente", "Iguana", "Sapo"};
        palabrasCompletasFrutas = new String [] {"Manzana", "Pera", "Uva", "Kiwi", "Arándano", "Cereza", "Aguacate", "Banano", "Piña", "Cocodrilo", "Guayaba", "Papaya", "Lulo", "Naranja", "Limón"};
        palabrasCompletasColores = new String[] {"Amarillo", "Azul", "Rojo", "Negro", "Naranja", "Verde", "Rosado", "Marrón", "Blanco", "Violeta", "Gris", "Magenta", "Cian", "Púrpura","Celeste"};
        
        palabrasIncompletasAnimales = new String [] {"L_ón", "Cang_ro", "T_gre", "K_ala", "P_rro", "G_to", "Elef_nte", "B_llena", "Zorr_", "Coc_drilo", "Burr_", "Cab_llo", "Serp_ente", "Ig_ana", "S_po"};
        palabrasIncompletasFrutas = new String [] {"Manz_na", "P_ra", "Uv_", "Kiw_", "Aránd_no", "C_reza", "Aguac_te", "Banan_", "P_ña", "M_lón", "Guayaba", "Pap_ya", "L_lo", "N_ranja", "L_món"};
        palabrasIncompletasColores = new String[] {"Amarill_", "Az_l", "R_jo", "N_gro", "Nar_nja", "V_rde", "R_sado", "M_rrón", "Blanc_", "Vi_leta", "Gr_s", "Mag_nta", "Ci_n", "Púrp_ra","Celest_"};
        
        this.categoria = categoria;
        numeroAciertos = 0;
        numeroFallos = 0;
    }
}
