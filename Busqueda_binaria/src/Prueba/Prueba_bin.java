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
public class Prueba_bin {
    public static void main(String [] args){
        int resultado,valor = 7;
        int[]vector ={1,4,7,8,9,14,23,47,56,60,61,63,65,66,68,69,70,73,76,77,79,80,82};
        Busqueda_binaria bin=new Busqueda_binaria();
        resultado=bin.busquedaBinaria(vector, valor);
        if(resultado!=0)
            System.out.println("El dato esta en la posicion "+resultado);
        else
            System.out.println("Su dato no se encuentra en la lista"); 
    }
}