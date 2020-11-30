/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaNotas;

import java.util.Scanner;
import poo.problema9.Examen;

/**
 *
 * @author pimie
 */
//POO = propiedades y comportamientos o funcionalidades
// fuera del POO son varibles globales y metodos o funciones
public class Notas {

    Scanner input = new Scanner(System.in);

    //int[] almacenNotas;
    int notas;
   

    // Variable Global, tiene un alcance en todos los metodos de la clase
    public Notas() {
    }

    public void ingresarNota() {

        System.out.println("Ingresa una Nota: ");
        notas = input.nextInt();

        
            
        }
    public void mostrarNotas(){
        System.out.println("La nota del alumno es: " + notas);
    }
    
   

    }


// int[] nota = Variable local o parametros, solo tienen un alcance local (dentro del metodo)

