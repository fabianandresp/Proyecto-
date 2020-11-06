
import java.util.Scanner;


public class Areas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcion;
        double h;
        double b;
        int r;
        double res;
        double res1;
        double p = 3.1416;
        do {

            System.out.println("BIENVENIDO AL SISTEMA!");
            System.out.println("1.- ÁREA DEL TRIANGULO");
            System.out.println("2.- ÁREA DEL CUADRADO");
            System.out.println("3.- ÁREA DEL CIRCULO");
            System.out.println("4.- SALIR DEL SISTEMA");
            System.out.println("ELIGE UNA OPCION: ");
            
            opcion = input.nextInt();
            
  

            switch (opcion) {

                case 1:
                    System.out.println("DAME UN VALOR PARA LA BASE DEL TRIANGULO: ");
                    b = input.nextInt();
                    System.out.println("DAME EL VALOR PARA LA ALTURA DEL TRIANGULO:  ");
                    h = input.nextInt();
                    res = (b * h) / 2;
                    System.out.println("EL ÁREA DEL TRIANGULO ES: " + res);
                    break;

                case 2:
                    System.out.println("DAME EL VALOR PARA LA BASE DEL CUADRADO: ");
                    b = input.nextInt();
                    res = b * b;
                    System.out.println("EL AREA DEL CUADRADO ES: " + res);
                    break;

                case 3:
                    System.out.println("DAME EL VALOR PARA EL RADIO: ");
                    r = input.nextInt();
                    res1 = (p * r * r);
                    System.out.println("EL ÁREA DEL CIRCULO ES: " + res1);
                    break;

                case 4:
                    System.out.println("GRACIAS POR VISITARNOS VUELVE CUANDO GUSTES!!!");
                    break;

                default:
                    System.out.println("LA OPCIÓN ELEGIDA NO SE ENCUENTRA EN EL SISTEMA");
                    break;

            }

        } while (opcion != 4);

    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package problema6;

import java.util.Scanner;

/**
 *
 * @author pimie
 

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
}*/
