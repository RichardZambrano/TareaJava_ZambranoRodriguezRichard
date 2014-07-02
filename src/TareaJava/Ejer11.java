/*
 11.) Dada una matriz de enteros, encontrar que se repite más veces. Devuelve el número que tiene más repeticiones. Si dos números tienen la misma cantidad de repeticiones, devuelva el número más bajo.
Por ejemplo, dada la matriz:
A = [1, 5, 3, -2, 4, 2, 4, -2, 5, 5, 2, 1, 3]
1 se repite 2 veces, 5 se repite 3 veces, 3 se repite 2 veces, 4 se repite 2 veces 2 se repite 2 veces
El número que más se repite es 5 La función debe devolver:.. 5 (5 Porque se repite 3 veces en la matriz).
La función recibirá una matriz de enteros y devolver un entero.

 */

package TareaJava;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList; 
 
/**
 *
 * @author Riky
 */
public class Ejer11 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Ingresar dimensión de la Matriz:\nx: ");
        int x=entrada.nextInt();
        System.out.println("y: ");
        
        int y=entrada.nextInt();
        int Valor1;
        int matriz[][]=new int [x][y];
        
        for (int i = 0; i < x; i++) 
        {
            for (int j = 0; j < y; j++) {
                System.out.println("Ingresar valor en la Posicion.: "+i+j);
                Valor1=entrada.nextInt();
                matriz[i][j]=Valor1;     
            }    
        }
        int dimension=x*y,A=0;
        
        int[] veContenedor=new int[dimension];
        for (int i = 0; i <x; i++) 
        {
            for (int j = 0; j < y; j++) {
                veContenedor[A]=matriz[i][j];
                //System.out.println(veContenedor[A]);
                A++;
            }
        }
        ArrayList matriz1=new ArrayList();
        ArrayList cant=new ArrayList();
        Arrays.sort(veContenedor);
        matriz1.add(veContenedor);
        
        int cc=0;
        for (int i = 0; i < veContenedor.length; i++)
        {
            if(veContenedor[i]!=veContenedor[cc+1])
            {
               matriz1.add(veContenedor[cc+1]);  
            } 
        }
       
        int numTemp, cantRepite = 0, numRepite = -1; 
        
        for (int i=0; i < veContenedor.length-1; i++)
        {
            numTemp = 1;
            for(int j = i+1 ; j< veContenedor.length; j++)
            {
                if(veContenedor[i] == veContenedor[j])
                    numTemp ++;                
            }
            if(numTemp > cantRepite){
                cantRepite = numTemp;
                numRepite = veContenedor[i];
            }
        }
        
        System.out.println("El número que mas se repite es: " + numRepite + 
                " Porque se repite " + cantRepite+" Veces en la matriz");      
    }
    
}
