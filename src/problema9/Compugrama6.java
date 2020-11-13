/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema9;

import java.util.Scanner;

/**
 *
 * @author pimie
 */
public class Compugrama6
{
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
                        int n = 7;
            int y=(n-1);
        for(i=0;i<n;i++){
        for( j=0;j<n;j++){
        if((i==j)||((i+j)==y)){
        System.out.print("*");
        }
        else{
        System.out.print(" ");
        }
     
        }System.out.println();
                    
                }
                System.out.println("*");
            }
          
            //Linea inferior
            for( i = 0; i < 7; i++) {
                System.out.print("*");
            }
       
        }
           }
}
/*
        Scanner input = new Scanner(System.in);
       int n;
       
        System.out.println("Digite el valor de n");
        
        n = input.nextInt();
         
        int y=(n-1);
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
        if((i==j)||((i+j)==y)){
        System.out.print("*");
        }
        else{
        System.out.print(" ");
        }
     
        }System.out.println();
        }
    }
}

