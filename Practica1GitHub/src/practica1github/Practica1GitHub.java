/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1github;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ernes
 */
public class Practica1GitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double temperaturas[] = new double[7];
        String dias[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int dia;
        double media, totalTemp = 0;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("La temperatura del " + dias[i] + " fue:");
            temperaturas[i] = sc.nextDouble();
            totalTemp = totalTemp + temperaturas[i];
        }
        media = totalTemp / temperaturas.length;
        System.out.println("\nLa media de temperaturas de la semana es: " + media);
        System.out.println("\nIntroduce un día para conocer su temperatura:");
        dia=sc.nextInt();
        System.out.println("La temperatura el "+dias[dia-1]+" fue de "+temperaturas[dia-1]+"º");
    }
    
}
