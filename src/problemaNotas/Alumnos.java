/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaNotas;

/**
 *
 * @author pimie
 */
public class Alumnos {

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
