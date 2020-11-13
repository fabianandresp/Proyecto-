/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema10;



/**
 *
 * @author pimie
 */
public class Compugrama3 {
        public static void main (String [] args){
            
     
            //Linea superior
            for(int i = 0; i < 7; i++) {
                System.out.print("*");
            }
            System.out.println();
           
            //centro de la forma
            for(int i = 0; i < 7-2; i++) {
                System.out.print("*");
                for(int j = 0; j < 7-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
           
            //Linea inferior
            for(int i = 0; i < ; i++) {
                System.out.print("*");
            }
       
        }
}
