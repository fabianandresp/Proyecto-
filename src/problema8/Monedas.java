/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema8;

/**
 *
 * @author pimie
 */
public class Monedas {
    int[] monedas = [1000,500,100,50,25]

int monto = 1700
int residuo = monto
for (moneda in monedas) {
    int cantidad = residuo / moneda
    println("Cantidad de Mondedas de $moneda = $cantidad")
    residuo = residuo % moneda
}
}
