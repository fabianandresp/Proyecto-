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

        Alumnos a = new Alumnos();

        a.setNombre("Fabian");
        a.setApellidos("Pimiento");
        a.setCedula(1152);

        a.getNombre();
        a.getApellidos();
        a.getCedula();

        a.datosAlumno();

        Notas b = new Notas();
        b.getNota();
    }

}
