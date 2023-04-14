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
public class Dia91ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner leer = new Scanner(System.in);
        
        
        
        System.out.println("ingrese el tamaño del vector " );
       int num=leer.nextInt();
        int[] vector = new int[num];
        int min_val = 1;
        int max_val = 10;
        ThreadLocalRandom tlr = ThreadLocalRandom.current();
        int b=1;
        boolean noseencontro=true;
        for (int i = 0; i < num; i++) {
            vector[i]=tlr.nextInt(min_val, max_val );
            System.out.println(""+vector[i]);
           //para ver los valores aleaorios
        }
        System.out.println("ingrese un numero a buscar");
        int numb=leer.nextInt();
        
        for (int i = 0; i < num; i++) {
            if(vector[i]==numb && b==1){
                System.out.println("el numero" +numb+ " se ha encontradoen la posicion :" +i);
                b=0;   
               noseencontro=false;
            }
             if(vector[i]==numb && b==0){
System.out.println("el numero" +numb+ " tambien se ha encontradoen la posicion :" +i);
             }
             
        }
        if (noseencontro==true) {
            System.out.println("no se encontro el numero");
            
        }
        
    }
    
}
