/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.problema9;

/**
 *
 * @author pimie
 */
public class PadreFamilia {
    
   String nombre;
   String apellido; 

    public PadreFamilia(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    PadreFamilia() {
   
    }
  
  

    @Override
    public String toString() {
        return "PadreFamilia{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
   
   
   
   
}
