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
public class Dia11Ej05Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //hacer una matriz fila 10 y 5 columnas nombres y 4 notas
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int K=0;
        
       // System.out.println("Ingresa tu nombre");
        int[][] M= new int [3][4];
        String []Nom = new String [3];
        
        for (int i = 0; i < 3; i++) {
           System.out.println("ingrese nombre del alumno  "); 
             Nom[i]=leer.next();
             for (int j = 0; j < 4; j++) {
                 System.out.println("ingrese la nota"+j);
                   M[i][j]=leer.nextInt();
                     
        }
        
      
      }
        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+M[i][j]+ "]");
                
            }
            System.out.println(" ");
        }
        
        */
        
       
            
        Prom (M,Nom );
        
  
        
  }      
        
    static public void Prom (int [][] M , String[]Nom ){
        int aprobados=0 , desaprobados=0;
        for (int i = 0; i < 3; i++) {

            double promedio =  M[i][0] * 0.1 + M[i][1] * 0.15 + M[i][2] * 0.25 + M[i][3] * 0.5;
            System.out.println("el alumno "+Nom[i]+ " tiene de nota Final " +promedio);
        if (promedio >= 7.0) {
                aprobados++;
            } else {
                desaprobados++;
            }
    
    }
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }
}