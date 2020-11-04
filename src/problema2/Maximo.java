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
    
    Scanner input = new Scanner (System.in);
    
    int [] caja = new int[3];
    int posMax= 0;
    
    
    for (int i =0; i<3;i++){
        System.out.println("Ingrese un numero: ");
        caja[i] = input.nextInt();
         System.out.println("En la posicion "+(i)+" se guardo: "+caja[i]);
    }
       
   int valorMax=Integer.MIN_VALUE;
   for ( int i = 0; i<3; i++){
       if ( caja[i]>valorMax)
           valorMax=caja[i];
    
   }
    System.out.println("El valor Maximo es : " + valorMax);
    
    
    
    
    
    /*for (int i=0; i<caja.length;i++){
        if (caja[i]>caja[]){
            max=i;
 */
        
       
    }
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
      