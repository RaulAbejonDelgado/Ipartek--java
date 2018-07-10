/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicosconextructurasecuandial8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author drohne
 */
public class EjerciciosBasicosConExtructuraSecuandial8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        //columen de una esfera
        //v = 4 * pi * radio³ / 3
        double volumen;
        System.out.println("Introduce el radio de la esfera:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double radio = Double.parseDouble(br.readLine());
        
        volumen = (4* Math.PI * (Math.pow(radio,3))) / 3;

        System.out.println("El volumen de la esfera es de : " +volumen+ " M³");
    }
    
}
