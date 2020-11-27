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
//POO = propiedades y comportamientos o funcionalidades
// fuera del POO son varibles globales y metodos o funciones
public class Notas {

    int[] nota = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    // Variable Global, tiene un alcance en todos los metodos de la clase

    public Notas() {
    }

    // int[] nota = Variable local o parametros, solo tienen un alcance local (dentro del metodo)
    public Notas(int[] nota) {

        for (int i = 0; i < this.nota.length; i++) {
            if (this.nota[i] >= 4) {
                System.out.println("APROBADO");

            } else if (this.nota[i] <= 3) {
                System.out.println("REPROBADO");
            }
        }
        System.out.println(nota[0]);
        System.out.println(nota[1]);
        System.out.println(nota[2]);

    }

    public int[] getNota() {
        return nota;
    }

    public void setNota(int[] nota) {
        this.nota = nota;
    }

}
