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
public class NotaAlumnoTester {

    public static void main(String[] args) {

        Alumnos a = new Alumnos("Fabian", "Pimiento", 1152);

        a.datosAlumno();

        int[] ejemplo = {20, 34, 56};
        Notas b = new Notas(ejemplo);
        b.getNota();

    }

}
// declarar y definir es lo mismo 
// inicializar una variable es declararla + asignar un valor ( = ) 
// operador de intanciar: new
// operador de asignacion: = 
