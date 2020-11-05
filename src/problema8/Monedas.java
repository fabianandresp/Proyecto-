/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema8;

import java.util.Scanner;

/**
 *
 * @author pimie
 */
public class Monedas {
    
    public static void main(String[] args){
       
    
    Scanner input = new Scanner(System.in);
    
    int[] monedas = {1000,500,100,10,5,1};

    int monto;
    int residuo;
    int moneda;
    
    System.out.println("Ingrese un monto");
            monto = input.nextInt();
    
            
    for (int i= 0; i<residuo; i++){
    residuo = monto / monedas[];
    }
    
    /*System.out.println(residuo);
    for (moneda in monedas) {
    int cantidad = residuo / moneda;
    
    System.out.println("Cantidad de Mondedas de $moneda = $cantidad");
    residuo = residuo % moneda;
    int[] monedas = [1000,500,100,50,25]

int monto = 1700
int residuo = monto
for (moneda in monedas) {
    int cantidad = residuo / moneda
    println("Cantidad de Mondedas de $moneda = $cantidad")
    residuo = residuo % moneda
}
}*/
}
}