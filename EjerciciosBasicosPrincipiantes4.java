/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicosprincipiantes4;

/**
 *
 * @author drohne
 */
public class EjerciciosBasicosPrincipiantes4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        
        System.out.println("El valor de las variables al inicio son : [a :"+a+". b:"+b+". c:"+c+". d:"+d+"]" );
        
        b = c;
        c = a;
        a = d;
        d = b;
        
        System.out.println("El valor de las variables al final son : [a :"+a+". b:"+b+". c:"+c+". d:"+d+"]" );
    }
    
}
