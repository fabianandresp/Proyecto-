
package problema2;

//import java.util.Scanner;


public class Aleatoria {
  private static int[] fisher_yates(int[] arreglo) {
    // recorremos todo el arreglo
    for(int i = arreglo.length - 1; i > 0; i--) {
      // calculamos un índice aleatorio dentro del rango permitido
      int shuffled_index = (int)Math.floor(Math.random() * (i + 1));
      //guardamos el elemento que estamos iterando
      int tmp = arreglo[i];
      // asignamos el elemento aleatorio al índice iterado
      arreglo[i] = arreglo[shuffled_index];
      // asignamos el elemento iterado al índice aleatorio
      arreglo[shuffled_index] = tmp;
    }
    return arreglo;

  }
    
    public static void main(String[] args) {
    int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    //Fisher-Yates shuffle:
    int[] shuffled = fisher_yates(arreglo);
    for (int i = 0, len = shuffled.length; i < len; i++) {
      System.out.println(shuffled[i]);
    }
  }
}
  
  
  
  
  
  
  
  
  
  
    //public static void mainp(String[] args) {
       
        //int a , b, c , d; 
        //int r = 4;
        //int resultado;
        
       // Scanner input = new Scanner(System.in);
        
        //System.out.println("Por favor, ingresa los numeros que deseas calcular");
        //a = input.nextInt();
        //b = input.nextInt();
        //c = input.nextInt();
        //d = input.nextInt();
        
       // resultado = (a + b + c + d)/ r;
        
        //System.out.println("Los numero ingresados son: " + a + b + c +d + " El promedio de estos numero es: " + resultado);
        
       
        
        
       
       
   // }
    
//}
