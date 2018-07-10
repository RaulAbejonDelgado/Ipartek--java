/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicosprincipiantes7;

/**
 *
 * @author drohne
 */
public class EjerciciosBasicosPrincipiantes7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c = 200;
        System.out.println(c+(c > 0 ? " Es positivo":" Es negativo"));
        System.out.println(c+(c%2==0 ? " Es par":" Es impar"));
        System.out.println(c+(c%5==0 ? " Es multiplo de 5":" No es multiplo de 5"));
        System.out.println(c+(c%10==0 ? " Es multiplo de 10":" No es multiplo de 10"));
        System.out.println(c+(c>100 ? " Es mayor de 100":" No es mayor de 100"));
    }
    
}
