/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
5.) Escriba una función para eliminar los duplicados de una matriz ordenada de enteros en una línea de código. 
(Usted puede usar tantas declaraciones como sea necesario, pero el código debe ser escrito en una sola línea).
Ejemplo:
Si la función recibe esta matriz: A = [-3, -2, 0, 0, 5, 7, 9, 11, 11, 25]
La función debe devolver: A = [-3, -2, 0, 5, 7, 9, 11, 25]
La función recibirá un arreglo de enteros, y devolver una matriz de enteros.

*/

package TareaJava;

import javax.swing.JOptionPane;
/**
 *
 * @author RikY
 */
public class Ejer5 {
   
    public static void main(String[] args){
    int N=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el rango del vector"));
            int[] vector=new int[N];
            int c=0;
    
    for (int i = 0; i < vector.length; i++) 
    {      
            int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número"));

            vector[i]=numero;
        }
         int i, j, vectorauxi;
         for(i=0;i<vector.length-1;i++)
              for(j=0;j<vector.length-i-1;j++)
                   if(vector[j+1]<vector[j]){
                      vectorauxi=vector[j+1];
                      vector[j+1]=vector[j];
                      vector[j]=vectorauxi;
                   } 
         System.out.println("Muestra vector con numeros ingresados \n");
         for ( i = 0; i < vector.length; i++)
         {
            System.out.print( vector[i]) ; 
        }
         System.out.println(" \n Muestra vector sin numeros repetidos \n" );
         int a1;
         for ( i = 0; i < vector.length; i++) 
         {
             if (i==0) {
             System.out.print(vector[i]);
             }
             else
             {
                 a1=i-1;
                 vectorauxi=vector[i];
             if (vectorauxi==vector[a1]) {
                 
             }else{
                 System.out.print(vector[i]);
             }
             }         
           }
      }
}