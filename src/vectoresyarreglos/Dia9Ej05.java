/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresyarreglos;


import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author pablo
 */
public class Dia9Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean band=true;
        int[][] matriz = new int[3][3];
        int[][] matrizAux = new int[3][3];
        int min_val = -1;
        int max_val = 1;
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
              }
        
             for (int k = 0; k < 3; k++) {
                 for (int j = 0; j < 3; j++) {
              if( matrizAux[j][k]==(-1)*matriz[k][j] && band==true){
              }else{
                  band=false;
                  System.out.println("la matriz no es antismetrica");
                  break;
              }
              break;
                }
                 }
                if (band==true) {
                    System.out.println("la matriz es antisimetrica");
            
        }
            
        } 
    }
   
    

    
    

