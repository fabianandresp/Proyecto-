package problema1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class Calculadora {

    public static void main(String[] args) {

        int a;
        int b;
        int resultado;
        Scanner entrada = new Scanner(System.in);
        String operador;
        
        
        
        System.out.println("Ingrese el primero numero: ");
        a = entrada.nextInt();
        System.out.println(" ¿Que operacion desea realizar? ");
        operador = entrada.next();
        System.out.println("Ingrese el segundo numero: ");
        b = entrada.nextInt();

        if (operador.equals("+")) {
            resultado = a + b;
            System.out.println(resultado);
        }

        else if (operador.equals("-")) {
            resultado = a - b;
            System.out.println(resultado);
        }

        else if (operador.equals("*")) {
            resultado = a * b;
            System.out.println(resultado);
        }
 
        else if (operador.equals("/")&&a>b) {
            resultado = a / b;
            System.out.println(resultado);    
        }
    }   
}