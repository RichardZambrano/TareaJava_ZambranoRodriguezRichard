/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
2.) Mira esta serie: 2, 2, 4, 12, 48, ... 
la semilla de esta serie fue el número 2 Mira esta serie:. 3, 3, 6, 18, 72, ... 
la semilla de esta serie fue el número 3.
Cree una función que recibe dos enteros: x, y  y. 
Si alguno de ellos es 0 o negativo, o si son mayores que 255, la función debe devolver -1
La función debe devolver el elemento y de las series generadas por x.
Por ejemplo, si la serie recibe x = 3, y = 4,
es conveniente devolver 72, porque 72 es el cuarto elemento de la serie generado cuando x = 3.
La función recibirá 2 enteros, y devuelve un entero.

*/

package TareaJava;


import javax.swing.JOptionPane;

/**
 *
 * @author RikY
 */
public class Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x,y,s;
        x=Integer.parseInt(JOptionPane.showInputDialog("Ingresar el valor del entero X"));
        y=Integer.parseInt(JOptionPane.showInputDialog("Ingresar el valor del entero Y"));
        if (x<=0 || x>255)
        {
            s=-1;
            JOptionPane.showMessageDialog(null,"Resultado "+s);
        }
        else
        {
            int[] arreglo=new int[y];
            arreglo[0]=x;
            for (int i = 1; i < arreglo.length; i++) 
            {
               x=x*(i+1);
               arreglo[i]=x;
                System.out.println(i+" "+arreglo[i]);               
            }
            for (int i = 0; i < arreglo.length; i++) 
            {
                if(i==(y-1))
                {
                    s=arreglo[i];
                    JOptionPane.showMessageDialog(null,"Resultado "+s);
                }
            }
        }
        
    }
    
}
