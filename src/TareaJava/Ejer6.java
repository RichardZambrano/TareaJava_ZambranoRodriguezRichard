/*
 6.) Dada una cadena, que contiene palabras y espacios (caracteres especiales), 
    crear una función que devuelva una cadena con las palabras en un orden inverso.
Ejemplo:

Si la función recibe: "esta es una prueba", debe regresar: "prueba una es este".
Si se recibe una cadena vacía, una cadena vacía se debe devolver. 
Si sólo hay una palabra recibida, la misma palabra que se debe devolver.
La función recibirá una cadena y devolver una cadena.

 */

package TareaJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;




/**
 *
 * @author RikY
 */
public class Ejer6 
 {
    public static void main(String [] args)throws IOException 
     {

      BufferedReader D = new BufferedReader(new InputStreamReader(System.in));

      System.out.println("Por favor ingrese una frase : ");
      
      String frase= D.readLine();
      String []palabra=frase.split(" ");

      for(int i=palabra.length-1;i>=0;i--)
      {
          System.out.print(palabra[i]+" ");
      }

    }
    
}
