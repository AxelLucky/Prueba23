/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package Prueba;

/**
 *
 * @author Propietario
 */
public class Cambio {

    public Cambio() {
    }
    public void ordenamientoIntercambio(int[] lista){
        int i, j, menor, posicion, a;
          for (i = 0; i < lista.length - 1; i++) { 
                menor = lista[i]; 
                posicion = i; 
                for (j = i + 1; j < lista.length; j++){ 
                      if (lista[j] < menor) { 
                          menor = lista[j]; 
                          posicion = j;
                      }
                }
                if (posicion != i){ 
                    a = lista[i];
                    lista[i] = lista[posicion];
                    lista[posicion] = a;
                }
            }
        System.out.println("Vector ordenado");
        for (i = 0; i < lista.length; i++)  
            System.out.print(lista[i]+" ");
    }
}