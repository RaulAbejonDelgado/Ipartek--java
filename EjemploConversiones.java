/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploconversiones;

/**
 *
 * @author drohne
 */
public class EjemploConversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 5;
        int b = 7;
        
        double c = 0.5; //implicita
        c = a ;
        a = (int)c; //Explicita o casting
        
        String s = "7";
        b = Integer.parseInt(s);
        System.out.println(b);
        
    }
    
}
