/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema6;

import java.util.Scanner;

/**
 *
 * @author pimie
 */
public class Areas {
    public static void main (String[] args){
    Scanner input = new Scanner(System.in);
        
    double a, b , c;
    double h;
    
    public  double areaRect(double a ,double b ){
    double resultado;
    resultado = a*b;
    return resultado; 
}
    public double areaCuad(double a, double b){
    double resultado;
    resultado = a*b;
    return resultado;
}
    public  double areaCir(double pi, double radio){
    double resultado;
    pi = Math.PI;
    resultado = Math.PI * Math.pow(radio,2);
    return resultado;  
}

    

    
    System.out.println("Bienvenido");
    System.out.println("En este programa podra sacar el area de un circulo, cuadrado o rectangulo"); 
    System.out.println("Que area desea calcular?");
    
  
            
                
            
    }
    }
}
