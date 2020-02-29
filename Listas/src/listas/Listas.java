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
        

        System.out.println("LISTAS SIMPLES");
        CircularSinglyLinkedList<Integer> myCSLL2 = new CircularSinglyLinkedList<>();
        try {
            // Lista numero 2 para validar el punto 3 de listas circular simple
            myCSLL2.addOrdered(50);
            myCSLL2.addOrdered(60);
            myCSLL2.addOrdered(70);
            myCSLL2.addOrdered(80);
            myCSLL2.addOrdered(90);
        } catch (Exception ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        }

        CircularSinglyLinkedList<Integer> myCSLL = new CircularSinglyLinkedList<>();
        try {
            // Variables para validar el punto 1
            myCSLL.addOrdered(10);
            myCSLL.addOrdered(89);
            myCSLL.addOrdered(12);
            myCSLL.addOrdered(40);
            myCSLL.addOrdered(178);
        } catch (Exception ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("LISTA ORGANIZADA DE MAYOR A MENOR: " + myCSLL.showData());// Punto 1
        int nodoe = 40;// Variable para validar el punto 2   
        System.out.println("MOSTRAR LISTA A PARTIR DE UN NODO ESPECIFICO: " + myCSLL.NodoRoute(nodoe));// Punto 2
        myCSLL.unirlist(myCSLL2);//Punto 3
        System.out.println("LISTA RESULTANTE AL UNIR LAS DOS LISTAS: " + myCSLL.showData());//Mostrar el punto 3
  
        
        System.out.println("");
        System.out.println("LISTAS DOBLES");
        //LISTAS DOBLES
        
        CircularDoublyLinkedList<Integer> myCDLL = new CircularDoublyLinkedList<>();
        try {
            //Variables para validar el punto 1
            myCDLL.addOrdered(10);
            myCDLL.addOrdered(88);
            myCDLL.addOrdered(44);
            myCDLL.addOrdered(66);
            myCDLL.addOrdered(90);
        } catch (Exception ex) {
            Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
        }


        System.out.println("CONTENIDO LISTA DOBLE DE MENOR A MAYOR: " + myCDLL.showData());// PUNTO 1

        int numexist= 90;// Variable para validar el punto 2
        System.out.println("EL DATO "+numexist+" EXISTE? "+ myCDLL.existe(90));// PUNTO 2
        
        
        System.out.println("LISTA 2: "+ myCDLL.div(66).showData()); // PUNTO 3
        
        System.out.println("LISTA 1: "+ myCDLL.showData());

    }
    


}
