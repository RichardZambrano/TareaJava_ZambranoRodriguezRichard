/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingresar el valor del entero X"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Ingresar el valor del entero Y"));
        if (x<=0 || x>255)
        {
            s=-1;
            JOptionPane.showMessageDialog(null,"El resultado es "+s);
        }
        else
        {
            int[] arreglo=new int[y];
            arreglo[0]=x;
            for (int i = 1;i<arreglo.length; i++) 
            {
               proceso=x/(i+1);
               arreglo[i]=proceso;           
            }
            for (int i = 0; i < arreglo.length; i++) 
            { 
              if(i==(y-1))
                {
                    
                    JOptionPane.showMessageDialog(null,"El resultado es "+arreglo[i]);
                }  
            }
        }
    }
    
}
