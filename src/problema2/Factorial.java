package problema2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pimie
 */
public class Factorial {
    
    
       public static void main(String[] args) {
           
     double fact = 1;
     double numero=30;
     
     while (numero != 0){
         fact = fact*numero; 
         numero--;
     }
     System.out.println(fact);
    }
}
    