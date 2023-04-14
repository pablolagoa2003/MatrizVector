/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresyarreglos;
 import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author pablo
 */
public class Dia9Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int cont1=0 , cont2=0 , cont3=0 , cont4=0, cont5=0;
         System.out.println("ingrese el tamaño del vector " );
       int num=leer.nextInt();
        int[] vector = new int[num];
        int min_val = 1;
        int max_val = 9;
        ThreadLocalRandom tlr = ThreadLocalRandom.current();
        //int b=1;
        
        
        
        boolean noseencontro=true;
        for (int i = 0; i < num; i++) {
            vector[i]=tlr.nextInt(min_val, max_val );
            System.out.println(""+vector[i]);
           //para ver los valores aleaorios
        }
        for (int i = 0; i < num; i++) {
            if (vector[i]<10 && vector[i]>=1) {
                   cont1++;
        }
           if (vector[i]<100 && vector[i]>=10) {
                   cont2++;  
        }
        if (vector[i]<1000 && vector[i]>=100) {
                   cont3++; 
    }
         if (vector[i] <10000 && vector[i]>=1000) {
                   cont4++; 
    }
          if (vector[i]<100000 && vector[i]>=10000) {
                   cont5++; 
    }
          }
            System.out.println("la cantidad de numeros de un digito es"+cont1);
             System.out.println("la cantidad de numeros de dos digito es"+cont2);
            System.out.println("la cantidad de numeros de tres digito es"+cont3);
            System.out.println("la cantidad de numeros de 4 digito es"+cont4);
            System.out.println("la cantidad de numeros de cinco digito es"+cont5);
            
            
}
        }
