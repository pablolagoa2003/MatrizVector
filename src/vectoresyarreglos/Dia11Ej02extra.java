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
public class Dia11Ej02extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Scanner leer = new Scanner(System.in);
         System.out.println("ingrese el largo del vector");
         int num= leer.nextInt();
         int[]Vector1= new int[num];
         int[]Vector2= new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("ingrese el valor de la posicion "+i+ " del vector1");
            Vector1[i]=leer.nextInt();
            System.out.println("ingrese el valor de la posicion "+i+ " del vector");
             Vector2[i]=leer.nextInt();
             
    }
        compa(Vector1,Vector2, num);
    
  }      
    public static void compa(int[] V1 , int[] V2 , int num){
        for (int i = 0; i < num; i++) {
            if (V1[i]!=V2[i]) {
                i=num;
                System.out.println("el vector no es igual");
            }
                
            }

            System.out.println("el vector es igual");
        
    }
}
