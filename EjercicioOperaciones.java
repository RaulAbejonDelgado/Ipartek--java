/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciooperaciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author drohne
 */
public class EjercicioOperaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        int primerNumeroint;
        int segundoNumeroint;
        double x,y;

        
        System.out.println("Por favor introduzca el primer numero");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String primerNumero = br.readLine();    
        primerNumeroint = Integer.parseInt(primerNumero) ;
        System.out.println("Por favor introduzca el segundo numero");    
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String segundoNumero = br2.readLine();  
        segundoNumeroint = Integer.parseInt(segundoNumero);
        System.out.println(segundoNumero);
        System.out.println("Suma: " + (primerNumeroint+segundoNumeroint));
        System.out.println("Resta: " + (primerNumeroint-segundoNumeroint));
        System.out.println("Multiplicacion: " + (primerNumeroint*segundoNumeroint));
        System.out.println("Division: " + (primerNumeroint/segundoNumeroint));
        System.out.println("Resto: " + (segundoNumeroint%primerNumeroint));

    }
    
}
