/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema7;

import java.util.Scanner;

/**
 *
 * @author pimie
 */
public class Exponencial {
    
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        
        
        int numero;
        int exponente;
        int resultado=1 ;
        
        System.out.println("Ingrese el numero x: ");
        numero = input.nextInt();
        System.out.println("Cuantas veces desea que se multiplique ese numero?");
        exponente = input.nextInt();
        
        
        for (int i=1; i<=exponente; i++){
            resultado = resultado * numero;
        }
        System.out.println("El resultado final es: " + resultado);
    }
}
