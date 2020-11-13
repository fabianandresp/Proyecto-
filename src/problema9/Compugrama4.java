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
public class Compugrama4 {
    
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
            
            // slach del centro 
            for (int i = 0; i<7;i++){
                for (int j = 0 ; j < i+1; j++){
                    if (i==){
                        System.out.print("*");
                    }
                }
            }
           
            //Linea inferior
            for(int i = 0; i < 7; i++) {
                System.out.print("*");
            }
       
        }
}

