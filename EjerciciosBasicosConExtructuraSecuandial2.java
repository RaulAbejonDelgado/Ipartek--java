/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicosconextructurasecuandial2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author drohne
 */
public class EjerciciosBasicosConExtructuraSecuandial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        System.out.println("Introduzca su nombre");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //convertimos la entrada a entero directamente
        String nombre = br.readLine();
        
        System.out.println("Buenos dias "+ nombre);
    }
    
}
