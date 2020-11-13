/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaNotas;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author pimie
 */
public class NotasAlumnos {
    
       public static void main (String[] args){
       
           Scanner input = new Scanner (System.in);
           ArrayList <Alumnos> ArrayListAlumnos = new ArrayList();
           Alumnos objAlumnos = new Alumnos();
           fecha objFecha = new Fecha();
           
           for (int i=0; i<4;i++){
               
               objAlumnos = new Alumnos();
               objFecha = new Fecha();
               int notas[] = new int[3];
               
               System.out.print ("\n Numero de expediente del " + (i+1)+ "Alumno");
               objAlumnos.setNumeroExpediente (input.nextInt());
               input.nextLine();
               
               System.out.print("Nº de Cedula: ");
               objAlumnos.setCedula(input.nextLine());
               
               System.out.print("Nombre y apellido: ");
               objAlumnos.setNombre(input.nextLine());
               
               System.out.println("Introduzca las notas correspondientes(0-100)");
               for (int j=0;j<4;j++){
                   int nota; 
                   do {
                       System.out.print("Nota " + (j+1)+ " : ");
                       nota=input.nextInt();
                       notas[j]=nota;
                   }
                   
               }
               
           }
           
           
           
           
           
           
       }
}
           
           
           
           
           
           
           
           
           
           
           
       