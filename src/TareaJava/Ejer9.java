/*
 9.) Dado un número entero positivo determinar si es la potencia de dos de otro número entero.
     No empezar a programar, lea las limitaciones.

Por ejemplo:

Si la función recibe 25, debe devolver TRUE, porque 5 ^ 2 = 25 Si la función recibe 1, debe devolver TRUE,
porque 1 ^ 2 = 1 Si la función recibe 16, debe devolver TRUE, porque 4 ^ 2 = 16 Si la función recibe 14, 
debería devolver FALSE.
Limitación: No es posible utilizar las funciones de raíz cuadrada (sqrt () o similar), 
potenciación (pow () o similar). Sólo se permiten las operaciones aritméticas básicas
(suma, resta, multiplicación, división), y las operaciones lógicas.
La función recibe un número entero positivo mayor que 0, y debe devolver un valor booleano.

 */

package TareaJava;

import javax.swing.JOptionPane;


/**
 *
 * @author Riky
 */
public class Ejer9
 {
        public static void main(String[] args){
             
            int numer=0,E=0;
        for (int i = 0; i < 2; i++) 
        {
            numer=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar un número entero positivo"));
             
            if (numer>0)
            {
                i=2;   
            }
   else
 {
  i=0;
  JOptionPane.showMessageDialog(null, "Ingresar Valores Enteros Positivos es Decir Ingresar Numeros Mayores a 0" );
            }  
        }
        
        long[] arreglo=new long[numer];
        
        for (int i = 0; i < arreglo.length; i++) 
        {
            arreglo[i]=i*i;           
        }
        for (int i = 0; i < arreglo.length; i++) 
        {
            if (numer==arreglo[i])
            {
                i=arreglo.length;
                E=1;
            }
        }
        if (E==1 || numer==1)
        {
            JOptionPane.showMessageDialog(null, "TRUE" );
        }
        else
        {
            JOptionPane.showMessageDialog(null, "FALSE" );
        }
        
    }
        
}