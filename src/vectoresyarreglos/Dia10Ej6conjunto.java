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
public class Dia10Ej6conjunto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for(int fila=0; fila<3;fila++){
            for(int columna=0;columna<3;columna++){
                System.out.println("Ingrese números entre el 0 y 9");
                System.out.println("Ingrese el elemento "+ fila+ " , " +columna+" de la matriz: ");
                int entrada=leer.nextInt();
                while(entrada<0 || entrada>9){
                    System.out.println("Ingreso incorrecto, vuelva a ingresar un número entre 0 y 9");
                    entrada=leer.nextInt();
                }
                matriz[fila][columna]=entrada;

            }
        }
        //Mostrar la matriz 
        for(int fila=0; fila<3;fila++){
            for(int columna=0;columna<3;columna++){
                System.out.print("["+matriz[fila][columna]+"]");
            }
            System.out.println("");
        }
        if (es_magica(matriz)) {
            System.out.println("La matriz es mágica.");
        }else{
            System.out.println("La matriz no es mágica.");
        }
    }
     public static int suma_fila(int[][] M,int fila){
        int suma=0;
        for (int i = 0; i <3; i++) {
            //suma=suma+M[fila][i];
            suma+=M[fila][i];
        }
        return suma;
    }
    public static int suma_col(int[][] M,int columna){
        int suma=0;
        for (int i = 0; i < 3; i++) {
            suma+=M[i][columna];
        }
        return suma;
    }
    public static int suma_diag(int[][] M){
        int suma=0;
        for (int i = 0; i < 3; i++) {
            suma+=M[i][i];
        }
        return suma;
    }
    public static int suma_contradiag(int[][] M){
        int suma=0;
        for (int i = 0; i < 3; i++) {
            suma+=M[2-i][i];
        }
        return suma;
    }
    public static boolean es_magica(int[][] M){
            if(suma_fila(M,0)!=suma_fila(M,1) || suma_fila(M,0)!=suma_fila(M,2)){
                return false;
            }
            if(suma_col(M,0)!=suma_col(M,1) || suma_col(M,0)!=suma_col(M,2)){
                return false;
            }
            if(suma_fila(M,0)!=suma_col(M,0)){
                return false;
            }
            if(suma_diag(M)!=suma_fila(M,0)|| suma_contradiag(M)!=suma_fila(M,0)){
                return false;
            }
            return true;
    }
}
