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
public class Notas {

    int[] nota = {0, 1, 2, 3, 4, 5, 6, 7};
  
    public Notas (){
        
    }
    public Notas(int [ ] nota) {

        for (int i = 0; i < nota.length; i++) {
            if (nota[i] >= 4) {
                System.out.println("APROBADO");

            } else if (nota[i] <= 3) {
                System.out.println("REPROBADO");
            }
        }

    }
}
