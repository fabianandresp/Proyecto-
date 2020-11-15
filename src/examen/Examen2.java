/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author pimie
 */
public class Examen2 {

    String nombre, apellido1, apellido2, sexo;
    float edad;
    String antecedente, tipoSangre, covid;
    String alertaSangre = "Tipo de sangre escaza";
    String alertaEdad = "Edad alta, paciente de cuidado";
    int eleccion, eleccion2; 
    String eleccion3, eleccion4;

    public String imprimirTodoDatos() {
        String imprimir = nombre + "\n " + apellido1 + "\n " + apellido2 + "\n " + sexo + "\n ";
        return imprimir;
    }

    public String imprimirTodoDatos(String antMed) {
        String imprimir = antecedente + "\n " + tipoSangre + "\n " + covid + "\n";
        return imprimir;
    }

    public void examen() {

        while (true) {

//Menu de entrada 
            Scanner input = new Scanner(System.in);

            System.out.println("Bienvenido!");
            System.out.println("Menu");
            System.out.println("1.- Incribir a un paciente");
            System.out.println("2.- Finalizar");
            eleccion = input.nextInt();

            switch (eleccion) {

                case 1:

                    System.out.println("ANTECENTES PERSONALES ");
                    System.out.println("Nombre: ");
                    nombre = input.next();

                    System.out.println("Apellido Paterno: ");
                    apellido1 = input.next();

                    System.out.println("Apellido Paterno: ");
                    apellido2 = input.next();

                    System.out.println("sexo (H/M: ");
                    sexo = input.next();

                    System.out.println("edad");
                    edad = input.nextInt();
                    if (50 <= edad) {
                        System.out.println(alertaEdad);
                    }

                    System.out.println("ANTECENTES MEDICOS IMPORTANTES");
                    System.out.println(" Tipo de Sangre: ");
                    tipoSangre = input.next();
                    if ("O+".equals(tipoSangre)) {
                        System.out.println(alertaSangre);
                    }
                    System.out.println("Antecedentes importantes: ");
                    antecedente = input.next();

                    System.out.println("¿El paciente tiene Covid19 (si/no):");
                    covid = input.next();
                        if ("si".equals(covid)) {
                        System.out.println("PACIENTE COVID, POR FAVOR TOMAR MEDIDAS!!!! ");
                    }

                    
                    
                    
                case 2:
                    System.out.println("El programa ha finalizado");

            }

            System.out.println("Menu");
            System.out.println("1.- Visualizar datos personales");
            System.out.println("2.- Visualizar antecedentes medicos");
            System.out.println("3.- Finalizar");
            eleccion2 = input.nextInt();
            switch (eleccion2) {
                case 1:
                    System.out.println(imprimirTodoDatos());

                    System.out.println("Desea conocer los antencedentes medicos?:");
                    eleccion3 = input.next();
                    if ("si".equals(eleccion3)) {
                        System.out.println(imprimirTodoDatos("b"));
                    } else if ("no".equals(eleccion3)) {
                        System.out.println("PROGRAMA FINALIZADO");
                    }

                case 2:
                    System.out.println(imprimirTodoDatos("a"));
                    System.out.println("Desea conocer los antencedentes personales?:");
                    eleccion4 = input.next();
                    if ("si".equals(eleccion4)) {
                        System.out.println(imprimirTodoDatos());
                    } else if ("no".equals(eleccion4)) {
                        System.out.println("PROGRAMA FINALIZADO");
                    }
                case 3:
                    System.out.println("PROGRAMA FINALIZADO");
            }

        }
    }
}
