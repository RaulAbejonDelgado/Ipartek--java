/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicosconextructurasecuandial5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author drohne
 */
public class EjerciciosBasicosConExtructuraSecuandial5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        double longitud;
        double area;
        
        System.out.println("Introduzca el radio:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double radio = Double.parseDouble(br.readLine());
        longitud = 2 * Math.PI * radio;
        area =Math.PI * Math.pow(radio,2);
        System.out.println("El area es : "+ area + " la longitud es : "+ longitud);

       
    }
    
}
