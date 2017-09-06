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
public class Busqueda_binaria {

    public Busqueda_binaria() {
    }
    
    public int busquedaBinaria(int  vector[], int dato){
        int n = vector.length;
        int posicion,inicio=0,fin=n-1;
        while(inicio<=fin){
            posicion=(fin+inicio)/2;
            if(vector[posicion]==dato)   
                return posicion;
            else 
                if(dato < vector [posicion] ){
                    fin=posicion-1;
                }
                else {
                     inicio=posicion+1;
                }
        }
        return 0;
    }
}
