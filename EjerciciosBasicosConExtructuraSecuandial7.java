/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicosconextructurasecuandial7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author drohne
 */
public class EjerciciosBasicosConExtructuraSecuandial7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        double hipotenusa;
        System.out.println("Introduce la altura del triangulo rectangulo:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double alturaT = Double.parseDouble(br.readLine());
        
        System.out.println("Introduce el largo del triangulo rectangulo:");
        double largoT = Double.parseDouble(br.readLine());
        //hipotenusa -> c = (a)²+(b)²
        hipotenusa = (Math.pow(alturaT,2) + Math.pow(largoT,2));

        System.out.println(hipotenusa);
    }
    
}
