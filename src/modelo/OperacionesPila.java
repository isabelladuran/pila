/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ISABE
 */
public class OperacionesPila {
    
    public static <T extends Base> Pila<T> pilaDuplicada(Pila<T> pilaOriginal){
        Pila<T> pilaDuplicada = new Pila<>();
        Pila<T> pilaAuxiliar = new Pila<>();
        
        while (pilaOriginal.estaVacia()) {
            T elemento = pilaOriginal.desapilar();
            pilaAuxiliar.apilar(elemento); 
        }
        while (!pilaAuxiliar.estaVacia()) {
            T elemento = pilaAuxiliar.desapilar();
            T copiaElemento = (T)elemento.copy();
            pilaOriginal.apilar(elemento);
            pilaDuplicada.apilar(copiaElemento);
        }
        
        return pilaDuplicada;
        
    }
    
}
