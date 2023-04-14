/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresyarreglos;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Dia10Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        
          Scanner leer = new Scanner(System.in);
          int b=0;
        int[][] matriz = new int[3][3];
        for(int fila=0; fila<3;fila++){
            for(int columna=0;columna<3;columna++){
                
                System.out.println("Ingrese el elemento "+ fila+ " , " +columna+" de la matriz: ");
                //int numero_aleatorio = (int) (Math.random() * (10));
                   b=0;   
                do {
                if (leer.nextInt()<10 && leer.nextInt()>0) {
                    matriz[fila][columna]=leer.nextInt();
                    b=1;
                }else{
                System.out.println("Ingrese el elemento "+ fila+ " , " +columna+" de la matriz: ");

                }
         
                 } while (b!=1);
        }
        
    }
    }
}
