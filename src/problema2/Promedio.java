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
public class Promedio {
    
       public static int promedio(int sumatoria, int n) {
        int resultado = 0;
        resultado = sumatoria / n;
        return resultado;
    }
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        
        int n;
        System.out.println("digite la cantidad de numeros que desea: ");
        n = input.nextInt();
        
        int suma=0;
        for (int i = 1; i <= n; i++){
            System.out.println("ingrese el numero " + i + " :");
            int num = input.nextInt();
            suma = suma + num;
            
             
         }
       
        System.out.println("El promedio es :" + promedio(suma,n));
        
        
    }
}
