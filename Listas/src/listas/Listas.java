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
        
//        CircularDoublyLinkedList<Integer> myCDLL = new CircularDoublyLinkedList<>();
//        myCDLL.addLast(99);
//        myCDLL.addLast(88);
//        myCDLL.addLast(77);
//        myCDLL.addLast(66);
//        myCDLL.addLast(55);
//
//        System.out.println("Contenido de la lista simple: " + myCDLL.showData());
//        try {
//            myCDLL.delete();
//            myCDLL.delete();
//            myCDLL.delete();
//            myCDLL.delete();
//            myCDLL.delete();
//
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//
//        System.out.println("Contenido de la lista simple despues del borrado: " + myCDLL.showData());

        CircularSinglyLinkedList<Integer> myCSLL = new CircularSinglyLinkedList<>();
        
        // Variables para validar el punto 1
        myCSLL.addOrdered(10);
        myCSLL.addOrdered(89);
        myCSLL.addOrdered(1);
        myCSLL.addOrdered(40);
        myCSLL.addOrdered(178);
        System.out.println("LISTA ORGANIZADA DE MAYOR A MENOR: " + myCSLL.showData());// Punto 1

        
        
        
        System.out.println("Contenido de la lista simple despues de borrar: " + myCSLL.showData());


    }

}
