/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*

3. Mira esta serie: 60, 30, 20, 15, 12 ... la semilla de esta serie fue el número 60.
Cree una función que recibe dos enteros: x, y y. Si alguno de ellos es 0 o negativo, o si son mayores que 255, 
la función debe devolver -1.
La función debe devolver el elemento y de las series generadas por x.
Por ejemplo: Si la función recibe x = 60, y = 3, devolverá 20, porque el 20 es el elemento 3 º 
en la serie genera cuando x = 60.
La función recibirá 2 enteros, devuelve un valor de punto flotante.

*/
package TareaJava;

import javax.swing.JOptionPane;

/**
 *
 * @author Riky
 */
public class Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x,y,s,proceso;
        x=Integer.parseInt(JOptionPane.showInputDialog
        ("Ingresar el valor del entero X"));
        y=Integer.parseInt(JOptionPane.showInputDialog
        ("Ingresar el valor del entero Y"));
        if (x<=0 || x>255)
        {
            s=-1;
            JOptionPane.showMessageDialog(null,"El resultado es  "+s);
        }
        else
        {
            int[] arreg=new int[y];
            arreg[0]=x;
            for (int i = 1;i<arreg.length; i++) 
            {
               proceso=x/(i+1);
               arreg[i]=proceso;           
            }
            for (int i = 0; i < arreg.length; i++) 
            { 
              if(i==(y-1))
                {
                    
                     JOptionPane.showMessageDialog(null,arreg[i]+"El resultado es ");
                }  
            }
        }
    }
    
}
