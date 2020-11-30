/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaNotas;

import java.util.Scanner;

/**
 *
 * @author pimie
 */
public class Alumnos {
    Scanner input = new Scanner (System.in);
    

    //Propiedades Variables globales
    String nombre;
    String apellidos;
    double cedula;

    public Alumnos() {
    }

    public Alumnos(String nombre, String apellidos, double cedula) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;

    }
    public void ingresarDatosAlumno(){
        
        System.out.println("Ingrese el nombre del alumno: ");
        nombre = input.next();
        
        System.out.println("Ingrese los apellidos del alumno: ");
        apellidos = input.next();
        
    }

    public void datosAlumno() {
        System.out.println("Estos son los datos del alumno: " + nombre + " " + apellidos + " " + cedula);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getCedula() {
        return cedula;
    }

    public void setCedula(double cedula) {
        this.cedula = cedula;
    }

}
