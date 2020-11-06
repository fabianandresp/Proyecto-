
package problema2;

//import java.util.Scanner;


public class Aleatoria {
  private static int[] numerosAlAzar(int[] arreglo) {
   
    for(int i = arreglo.length - 1; i > 0; i--) {
      int numero = (int)Math.floor(Math.random() * (i + 1));
      int tmp = arreglo[i];
      arreglo[i] = arreglo[numero];
      arreglo[numero] = tmp;
    }
    return arreglo;

  }
    
    public static void main(String[] args) {
    int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] alae = numerosAlAzar(arreglo);
    for (int i = 0, len = alae.length; i < len; i++) {
      System.out.println(alae[i]);
    }
  }
}
  
  
  
  