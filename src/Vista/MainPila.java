/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import datos.Productos;
import modelo.Pila;
import modelo.OperacionesPila;

/**
 *
 * @author ISABE
 */
public class MainPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pila<Productos> pilaP= new Pila<>();
        pilaP.apilar(new Productos("Arroz", 2 , 5000));
        pilaP.apilar(new Productos("Azúcar", 3 , 7000));
        pilaP.apilar(new Productos("Pan", 8 , 4500));
        pilaP.apilar(new Productos("Huevos", 10 , 8000));
        pilaP.apilar(new Productos("Leche", 1 , 3000));
        pilaP.apilar(new Productos("Manzanas", 3 , 3500));
        pilaP.apilar(new Productos("Fresas", 8 , 6000));
        
        System.out.println("Pila: \n" + pilaP.toString());
        System.out.println("Pila Duplicada: \n" + OperacionesPila.pilaDuplicada(pilaP));
        
        pilaP.desapilar();
        System.out.println("Pila \n" + pilaP.toString());
        
        

    }
    
    
    
}
