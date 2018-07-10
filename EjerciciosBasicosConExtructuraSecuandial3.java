/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicosconextructurasecuandial3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author drohne
 */
public class EjerciciosBasicosConExtructuraSecuandial3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca un numero");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //convertimos la entrada a entero directamente
        int numero = Integer.parseInt(br.readLine());
        System.out.println("El numero introducido x 2 es: "+(numero * 2));
        System.out.println("El numero introducido x 3 es: "+(numero * 3));
    }
    
}
