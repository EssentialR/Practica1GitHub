/*
2. Programa que lee desde teclado la temperatura de una semana(todos los días)
y calcula la temperatura media. Permite después introducir un día y nos dice la
temperatura que hizo ese día.
3. Añadir una opción al programa anterior para que escriba por pantalla los días
en que se registró la temperatura máxima y la mínima.
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
        double media, totalTemp = 0, max, min;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("La temperatura del " + dias[i] + " fue:");
            temperaturas[i] = sc.nextDouble();
            totalTemp = totalTemp + temperaturas[i];
        }
        
        max=min=temperaturas[0];
        for(int i=0;i<temperaturas.length;i++){
            if(min>temperaturas[i])
                min=temperaturas[i];
            if(max<temperaturas[i])
                max=temperaturas[i];
        }
        media = totalTemp / temperaturas.length;
        System.out.println("\nLa media de temperaturas de la semana es: " + media);
        System.out.println("\nIntroduce un día para conocer su temperatura:");
        dia=sc.nextInt();
        System.out.println("La temperatura el "+dias[dia-1]+" fue de "+temperaturas[dia-1]+"º");
        System.out.println("La temperatura máxima fue: "+max);
        System.out.println("La temperatura mínima fue: "+min);
    }
    
}
