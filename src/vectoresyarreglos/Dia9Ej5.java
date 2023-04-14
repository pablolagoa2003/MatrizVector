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
public class Dia9Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereScanner leer = new Scanner(System.in);
   
   
        int[][] matriz = new int[3][3];
        int[][] matrizAux = new int[3][3];
        int min_val = 1;
        int max_val = -1;
        ThreadLocalRandom tlr = ThreadLocalRandom.current();
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=tlr.nextInt(min_val,max_val );
                System.out.print(""+matriz[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
       for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               matrizAux[j][i]= matriz[i][j];
                }
                }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(""+matrizAux[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
            
             for (int i = 0; i < 3; i++) {
                 for (int j = 0; j < 3; j++) {
              if( matrizAux[j][i]==matriz[i][j]){
                  
              }else{
                  System.out.println("la matriz no es antismetrica");
              }
                }
                }
            
        } 
    }
   
    
}
