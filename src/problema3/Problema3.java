/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.util.Scanner;

/**
 *
 * @author pimie
 */
public class Problema3 {
    //Impuesto sobre la renta 
    
    public static void main (String[] args){
    
    Scanner datos = new Scanner(System.in);
    
        
    double salario, dependientes, neto, resultado1;  
    double gravable, gravable2, gravable3, gravable4, gravable5; 
    
    System.out.println("Ingrese el salario a calcular: ");
    salario = datos.nextDouble();
    System.out.println("Cuantos dependientes tiene el colaborador?");
    dependientes = datos.nextDouble();
    
    if ( dependientes <= 1){
        gravable=salario;
        System.out.println("El 100% de su sueldo es gravable");
        if ( gravable < 200000){
            System.out.println("Su salario no aplica para al impuesto de Renta");
        }
        else if (gravable < 400000 && gravable >= 200000 ){
            System.out.println("Su salario si aplica al impuesto de Renta");
            resultado1 = (gravable*10)/100;
            System.out.println("El monto del IR a pagar es: "+ resultado1);
            neto= salario - resultado1;
            System.out.println("Su salario neto es: "+neto);
        }
         else if (gravable < 600000 && gravable >= 400000 ){
            System.out.println("Su salario si aplica al impuesto de Renta");
            resultado1 = (gravable*15)/100;
            System.out.println("El monto del IR a pagar es: "+ resultado1);
            neto= salario - resultado1;
            System.out.println("Su salario neto es: "+neto);
        }
        else if (gravable < 800000 && gravable >= 600000 ){
            System.out.println("Su salario si aplica al impuesto de Renta");
            resultado1 = (gravable*20)/100;
            System.out.println("El monto del IR a pagar es: "+ resultado1);
            neto= salario - resultado1;
            System.out.println("Su salario neto es: "+neto);
        }
        else if (gravable >= 800000 ){
            System.out.println("Su salario si aplica al impuesto de Renta");
            resultado1 = (gravable*30)/100;
            System.out.println("El monto del IR a pagar es: "+ resultado1);
            neto= salario - resultado1;
            System.out.println("Su salario neto es: "+neto);
        }
        else {
            
        }
        
    }
    else if (dependientes == 2){
        gravable2 = (salario*90)/100;
        System.out.println("El 90% de su sueldo es gravable");
        if ( gravable2 < 200000){
            System.out.println("Su salario no aplica para al impuesto de Renta");
        }
        else if (gravable2 < 400000 && gravable2 >= 200000 ){
            System.out.println("Su salario si aplica al impuesto de Renta");
            resultado1 = (gravable2*10)/100;
            System.out.println("El monto del IR a pagar es: "+ resultado1);
            neto= salario - resultado1;
            System.out.println("Su salario neto es: "+neto);
        }
         else if (gravable2 < 600000 && gravable2 >= 400000 ){
            System.out.println("Su salario si aplica al impuesto de Renta");
            resultado1 = (gravable2*15)/100;
            System.out.println("El monto del IR a pagar es: "+ resultado1);
            neto= salario - resultado1;
            System.out.println("Su salario neto es: "+neto);
        }
        else if (gravable2 < 800000 && gravable2 >= 600000 ){
            System.out.println("Su salario si aplica al impuesto de Renta");
            resultado1 = (gravable2*20)/100;
            System.out.println("El monto del IR a pagar es: "+ resultado1);
            neto= salario - resultado1;
            System.out.println("Su salario neto es: "+neto);
        }
        else if (gravable2>= 800000 ){
            System.out.println("Su salario si aplica al impuesto de Renta");
            resultado1 = (gravable2*30)/100;
            System.out.println("El monto del IR a pagar es: "+ resultado1);
            neto= salario - resultado1;
            System.out.println("Su salario neto es: "+neto);
        }
        else {
            
        }
    
    }
    else if (dependientes == 3){
        gravable3 = (salario*70)/100;
        System.out.println("El 90% de su sueldo es gravable");
        if ( gravable3 < 200000){
            System.out.println("Su salario no aplica para al impuesto de Renta");
        }
        else if (gravable3 < 400000 && gravable3 >= 200000 ){
            System.out.println("Su salario si aplica al impuesto de Renta");
            resultado1 = (gravable3*10)/100;
            System.out.println("El monto del IR a pagar es: "+ resultado1);
            neto= salario - resultado1;
            System.out.println("Su salario neto es: "+neto);
        }
         else if (gravable3 < 600000 && gravable3 >= 400000 ){
            System.out.println("Su salario si aplica al impuesto de Renta");
            resultado1 = (gravable3*15)/100;
            System.out.println("El monto del IR a pagar es: "+ resultado1);
            neto= salario - resultado1;
            System.out.println("Su salario neto es: "+neto);
        }
        else if (gravable3 < 800000 && gravable3 >= 600000 ){
            System.out.println("Su salario si aplica al impuesto de Renta");
            resultado1 = (gravable3*20)/100;
            System.out.println("El monto del IR a pagar es: "+ resultado1);
            neto= salario - resultado1;
            System.out.println("Su salario neto es: "+neto);
        }
        else if (gravable3>= 800000 ){
            System.out.println("Su salario si aplica al impuesto de Renta");
            resultado1 = (gravable3*30)/100;
            System.out.println("El monto del IR a pagar es: "+ resultado1);
            neto= salario - resultado1;
            System.out.println("Su salario neto es: "+neto);
        }
        else {
            
        }
    }
    else if (dependientes == 4){
        gravable4 = (salario*60)/100;
        System.out.println("El 60% de su sueldo es gravable");
        if ( gravable4 < 200000){
            System.out.println("Su salario no aplica para al impuesto de Renta");
        }
        else if (gravable4 < 400000 && gravable4 >= 200000 ){
            System.out.println("Su salario si aplica al impuesto de Renta");
            resultado1 = (gravable4*10)/100;
            System.out.println("El monto del IR a pagar es: "+ resultado1);
            neto= salario - resultado1;
            System.out.println("Su salario neto es: "+neto);
        }
         else if (gravable4 < 600000 && gravable4 >= 400000 ){
            System.out.println("Su salario si aplica al impuesto de Renta");
            resultado1 = (gravable4*15)/100;
            System.out.println("El monto del IR a pagar es: "+ resultado1);
            neto= salario - resultado1;
            System.out.println("Su salario neto es: "+neto);
        }
        else if (gravable4 < 800000 && gravable4 >= 600000 ){
            System.out.println("Su salario si aplica al impuesto de Renta");
            resultado1 = (gravable4*20)/100;
            System.out.println("El monto del IR a pagar es: "+ resultado1);
            neto= salario - resultado1;
            System.out.println("Su salario neto es: "+neto);
        }
        else if (gravable4>= 800000 ){
            System.out.println("Su salario si aplica al impuesto de Renta");
            resultado1 = (gravable4*30)/100;
            System.out.println("El monto del IR a pagar es: "+ resultado1);
            neto= salario - resultado1;
            System.out.println("Su salario neto es: "+neto);
        }
        else {
            
        }
}
    else if (dependientes >= 5){
        gravable5 = (salario*40)/100;
        System.out.println("El 40% de su sueldo es gravable");
        if ( gravable5 < 200000){
            System.out.println("Su salario no aplica para al impuesto de Renta");
        }
        else if (gravable5 < 400000 && gravable5 >= 200000 ){
            System.out.println("Su salario si aplica al impuesto de Renta");
            resultado1 = (gravable5*10)/100;
            System.out.println("El monto del IR a pagar es: "+ resultado1);
            neto= salario - resultado1;
            System.out.println("Su salario neto es: "+neto);
        }
         else if (gravable5 < 600000 && gravable5 >= 400000 ){
            System.out.println("Su salario si aplica al impuesto de Renta");
            resultado1 = (gravable5*15)/100;
            System.out.println("El monto del IR a pagar es: "+ resultado1);
            neto= salario - resultado1;
            System.out.println("Su salario neto es: "+neto);
        }
        else if (gravable5 < 800000 && gravable5 >= 600000 ){
            System.out.println("Su salario si aplica al impuesto de Renta");
            resultado1 = (gravable5*20)/100;
            System.out.println("El monto del IR a pagar es: "+ resultado1);
            neto= salario - resultado1;
            System.out.println("Su salario neto es: "+neto);
        }
        else if (gravable5>= 800000 ){
            System.out.println("Su salario si aplica al impuesto de Renta");
            resultado1 = (gravable5*30)/100;
            System.out.println("El monto del IR a pagar es: "+ resultado1);
            neto= salario - resultado1;
            System.out.println("Su salario neto es: "+neto);
        }
        else {
            
        }
}
}
}