/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicosconextructurasecuandial1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author drohne
 */
public class EjerciciosBasicosConExtructuraSecuandial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        System.out.println("Introduzca el primer numero por pantalla");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //convertimos la entrada a entero directamente
        int uno = Integer.parseInt(br.readLine());
        System.out.println("Introduzca el segundo numero por pantalla");
        int dos = Integer.parseInt(br.readLine());
        System.out.println(uno +" - "+ dos);
    }
    
}
