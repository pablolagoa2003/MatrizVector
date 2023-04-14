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
public class Dia10Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for(int fila=0; fila<3;fila++){
            for(int columna=0;columna<3;columna++){
                System.out.println("Ingrese el elemento "+ fila+ " , " +columna+" de la matriz: ");
                //int numero_aleatorio = (int) (Math.random() * (10));
                matriz[fila][columna]=leer.nextInt();
            }
        }
        //Mostrar la matriz 
        for(int fila=0; fila<3;fila++){
            for(int columna=0;columna<3;columna++){
                System.out.print("["+matriz[fila][columna]+"]");
            }
            System.out.println("");
        }
        for(int fila=0; fila<3;fila++){
            for(int columna=0;columna<3;columna++){
                System.out.print("["+matriz[columna][fila]+"]");
            }
            System.out.println("");
        }
        
       if(es_antisimetrica(matriz)){
           System.out.println("La matriz es anisimétrica");
       }else{
           System.out.println("la matriz no es antisimétrica");
        }
    }
    public static boolean es_antisimetrica(int[][] M){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if (M[i][j]!=-M[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
    }
    

