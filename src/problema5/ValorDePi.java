/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema5;

import java.util.Scanner;

/**
 *
 * @author pimie
 */
public class ValorDePi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        
        float a = 4;
        float b = 3;
        float pi; 
        pi= a - (a/b);
        float resultado;
        
        for ( float i= b+2; i<=101 ;i++)  {
            
            resultado = pi + a/i;
             System.out.println(resultado);
        }
        
       
        
        
    }
}
