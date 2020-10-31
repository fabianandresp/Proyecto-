/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.Scanner;

/**
 *
 * @author pimie
 */
public class Maximo {
    public static void main( String[] args){
        
        int numero = 0;
        int [] almacen = new int [10];
        Scanner input = new Scanner(System.in);
        
        for (int i =0; i<10; i++){
            System.out.println(" ingresa el numero:");
            almacen[i] = input.nextInt();
            numero = numero + almacen[i];
        }
        for (int i = 0; i<10 ; i++){
            System.out.println (" En la posicion " + (i+1)+ "se guardo: " + almacen[i]);
            
         double result = maximo(almacen[i]);
         System.out.println ("El numero maximo es " + result);
        }
        
        
        }
        
    }
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 /*public static void main(String[] args)
     {
      
       Scanner input = new Scanner(System.in);

       
       System.out.print(
         "Ingresa 3 numeros: ");
       double num1 = input.nextDouble(); 
       double num2 = input.nextDouble(); 
       double num3 = input.nextDouble(); 

     
       double resultado = maximum(num1, num2, num3);

       
       System.out.println("El numero maximo es: " + result);
     }

            
     public static double maximum(double x, double y, double z)     
     {                                                              
       double maximumValue = x; 
      
       if (y > maximumValue)                                       
         maximumValue = y;                                        
       
       if (z > maximumValue)                                       
         maximumValue = z;                                        

       return maximumValue;                                        
     }                                                              
    
   
}
	
    
    
    
    


    