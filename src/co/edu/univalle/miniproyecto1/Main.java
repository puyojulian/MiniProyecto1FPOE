/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.univalle.miniproyecto1;

import co.edu.univalle.miniproyecto1.view.VistaInicio;
import java.awt.GraphicsEnvironment;
import java.util.Arrays;

/**
 *
 * @author julia
 */
public class Main {
    public static void main(String[] args) {
        VistaInicio ventana = new VistaInicio(); 
        
        String[] fontNames=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        System.out.println(Arrays.toString(fontNames));
    }
}
