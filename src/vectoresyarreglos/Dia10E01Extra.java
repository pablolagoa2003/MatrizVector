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
public class Dia10E01Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner leer = new Scanner(System.in);
          System.out.println("ingrese el tamaño del vector");
          int num=leer.nextInt();
         int[]Vector= new int[num];
        int valor=suma(Vector,num);
        System.out.println("la suma es"+valor);
    }
    public static int suma(int[] V, int num){
         Scanner leer = new Scanner(System.in);
        int suma=0;
        for (int i = 0; i < num; i++) {
            System.out.println("ingrese el valor de la posicion "+i);
            V[i]=leer.nextInt();
            suma+=V[i];
            
        }
        return suma;
    }
}
