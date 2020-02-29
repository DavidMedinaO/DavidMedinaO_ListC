/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author s103e28
 */
public class CircularSinglyLinkedList<T extends  Comparable> implements Ilist<T> {

    Node<T> head;
    Node<T> tail;

    public CircularSinglyLinkedList() {
        head = tail = null;
    }

    private Node<T> addNode(T d) {
        Node<T> newNode = new Node<>(d);
        if (isEmpty()) {
            head = tail = newNode;
            newNode.setNextNode(newNode);
        } else {
            newNode.setNextNode(head);
            tail.setNextNode(newNode);
        }
        return newNode;
    }

    @Override
    public void add(T d) {
        head = addNode(d);
    }

    @Override
    public void addLast(T d) {
        tail = addNode(d);
    }

       
    @Override
    public void delete() throws Exception {
         if (isEmpty()) {
            throw new Exception("No existen datos por borrar...");
        } else if (head == tail) {
            head = null;
        } else {
            tail.setNextNode(head.getNextNode());
            head = head.getNextNode();
        }
    }

    @Override
    public void deleteLast() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String showData() {
        String data = "";
        Node<T> current = this.head;
        do{
            data = data + current.getData() + " ";
            current = current.getNextNode();
        }while (current != head);
        return data;
    }
    
    @Override
    public void addOrdered(T d) throws Exception {
        if (isEmpty() || d.compareTo(head.getData()) == 1) {
            add(d);

            return;
        }
        if (d.compareTo(tail.getData()) == -1) {
            addLast(d);

            return;
        }
        
        Node<T> aux = this.head;
        do{
                if(aux.getData()== d){
                
                    throw new Exception("DATO REPETIDO, YA EXISTE EN LA LISTA");
                }
               aux = aux.getNextNode();
        }while(aux != head); 

        Node<T> current = head;
        Node<T> newNode;

        while (current.getNextNode() != head && d.compareTo(current.getNextNode().getData()) == -1) {

            current = current.getNextNode();
        }

        newNode = new Node<>(d, current.getNextNode());
        current.setNextNode(newNode);
    }

     public String NodoRoute(T d) {

        String data = "";
        if (d.compareTo(head.getData()) == 0) {

            data = showData();
            return data;

        }
        Node<T> current = head.getNextNode();

        while (current != head) {
            data = "";
            Node<T> nodoe = current;
            do {
                data = data + nodoe.getData() + " ";
                nodoe = nodoe.getNextNode();
            } while (nodoe != current);

            if (d.compareTo(current.getData()) == 0) {

                return data;
            }
            current = current.getNextNode();

        }

        return data;
    }
    
    public void  unirlist(CircularSinglyLinkedList<T> list2){
    
        this.tail.setNextNode(list2.head);
        list2.tail.setNextNode(this.head);
    
        
        
        

    }
    
    ////////CASO PRACTICO
    
    public String showCancion() {
        String data = "";
        Node<Videos> current = (Node<Videos>) this.head;
        do{
            data = data + current.getData().getCancion() + " / ";
            current = current.getNextNode();
        }while (current != head);
        return data;
    }
    
     public void deleteCan(String d)  {
         
         Node<Videos> current = (Node<Videos>) this.head;
         Node<Videos> current2 = (Node<Videos>) this.head;
         if (d.equals(current.getData().getCancion())) {

             this.head = current.getNextNode();
             this.tail.setNextNode(head);

         }
         int i =0;
         current = current.getNextNode();
         while(current != head){
                 if(i>0){
                 
                 String dat = current.getData().getCancion();  
                 current2= current2.getNextNode(); 
                 }
                  
                 if(d.equals(current.getData().getCancion())){
                 
                     current2.setNextNode(current2.getNextNode().getNextNode());
                     System.out.println("hola");
                 
                 }
         current = current.getNextNode();
         i=i+1; 
         }
     }
         
      public void reproducir() throws InterruptedException{
        
        Node<Videos> current = (Node<Videos>) this.head;
      
        do{
            System.out.println("Reproduciendo: "+ current.getData().getCancion());
            current = current.getNextNode();
            TimeUnit.SECONDS.sleep(3);
        }while (current != head);

    }    
         
 }
     

