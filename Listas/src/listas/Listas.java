/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Stack;

/**
 *
 * @author s208e19
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        


        CircularSinglyLinkedList<Integer> myCSLL2 = new CircularSinglyLinkedList<>();
        // Lista numero 2 para validar el punto 3 de listas circular simple
        myCSLL2.addOrdered(50);
        myCSLL2.addOrdered(60);
        myCSLL2.addOrdered(70);
        myCSLL2.addOrdered(80);
        myCSLL2.addOrdered(90);

        CircularSinglyLinkedList<Integer> myCSLL = new CircularSinglyLinkedList<>();
        // Variables para validar el punto 1
        myCSLL.addOrdered(10);
        myCSLL.addOrdered(89);
        myCSLL.addOrdered(12);
        myCSLL.addOrdered(40);
        myCSLL.addOrdered(178);
        System.out.println("LISTA ORGANIZADA DE MAYOR A MENOR: " + myCSLL.showData());// Punto 1
        int nodoe = 40;// Variable para validar el punto 2   
        System.out.println("MOSTRAR LISTA A PARTIR DE UN NODO ESPECIFICO: " + myCSLL.NodoRoute(nodoe));// Punto 2
        myCSLL.unirlist(myCSLL2);//Punto 3
        System.out.println("LISTA RESULTANTE AL UNIR LAS DOS LISTAS: " + myCSLL.showData());//Mostrar el punto 3
  
        
        
        
        
        CircularDoublyLinkedList<Integer> myCDLL = new CircularDoublyLinkedList<>();
        myCDLL.addLast(99);
        myCDLL.addLast(88);
        myCDLL.addLast(77);
        myCDLL.addLast(66);
        myCDLL.addLast(55);

        System.out.println("Contenido de la lista doble: " + myCDLL.showData());

        System.out.println("Contenido de la lista doble despues del borrado: " + myCDLL.showData());

    }

}
