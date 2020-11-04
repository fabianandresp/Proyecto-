/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

import java.util.Scanner;

/**
 *
 * @author pimie
 */
public class añoBisiesto {
    
    public static void main (String[] args){
        
    Scanner input = new Scanner(System.in);
    
    int anno;
    System.out.println("Ingrese un año: ");
    anno = input.nextInt();
    double residuo1 = anno % 4;
    double residuo2 = anno & 100;
    double residuo3 = anno % 400;

    if (residuo1 == 0 && ( residuo2 !=0 || residuo3 ==0) ){
        System.out.println("El año que ingresaste es Biciesto!!");
    }
    else {
        System.out.println("El año que ingresaste no es biciesto!!");
    }
    }  
}
