/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicosconextructurasecuandial6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author drohne
 */
public class EjerciciosBasicosConExtructuraSecuandial6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        double longitud;
        double area;
        
        System.out.println("Introduzca La velocidad:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double velocidadKm = Double.parseDouble(br.readLine());
        // 1h = 3600 segundos
        // 1km = 1000 metros
        //
        double velocidadM = (velocidadKm * 1000) / 3600;
        System.out.println(velocidadM);
    }
    
}
