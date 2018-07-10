/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciohoradia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author drohne
 */
public class EjercicioHoraDia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int horas = Integer.parseInt(br.readLine());
        int minutos = Integer.parseInt(br.readLine());
        if (horas == 12 && minutos == 0)
            System.out.println("MedioDia");
        else
            if (horas == 0 && minutos == 0)
                System.out.println("MediaNoche");
            else
                if (horas > 0 && horas < 7)
                    System.out.println("Madrugada");
                else
                    if (horas >=7 && horas <12)
                        System.out.println("Mañana");
                    else
                        if (horas > 12 && horas < 21)
                            System.out.println("Tarde");
                        else
                            if (horas > 21 && horas < 24)
                                System.out.println("Noche");
                            
    }
    
}
