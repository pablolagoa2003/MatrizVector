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
public class Dia9Ej13Ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("ingrese la cantidad del grupo");
        num=leer.nextInt();
        String[] vector = new String[num];
        for (int i = 0; i < num; i++) {
             System.out.println("ingrese un nombre del grupo");
            vector[i]=leer.next();
            
        }
        for (int i = 0; i < num; i++) {
            System.out.println("el nombre dela posicion " +i+ " del vector es " +vector[i]);
        }
    }
    
}
