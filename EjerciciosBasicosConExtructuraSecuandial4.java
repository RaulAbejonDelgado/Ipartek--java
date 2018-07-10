/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicosconextructurasecuandial4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author drohne
 */
public class EjerciciosBasicosConExtructuraSecuandial4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca su temperatura en grados centigrados");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //convertimos la entrada a entero directamente
        int temperaturaC = Integer.parseInt(br.readLine());
        int temperaturaF = 32 + ( 9 * temperaturaC / 5);
        System.out.println("La temperatura de "+ temperaturaC + " centigrados, es equivalente a : "+ temperaturaF + " grados farenheit");
        
    }
    
}
