/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author s103e28
 */
public class CircularSinglyLinkedList<T extends Number & Comparable> implements Ilist<T> {

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
    public void addOrdered(T d) {
        if (isEmpty() || d.compareTo(head.getData()) == 1) {
            add(d);

            return;
        }
        if (d.compareTo(tail.getData()) == -1) {
            addLast(d);

            return;
        }

        Node<T> current = head;
        Node<T> newNode;

        while (current.getNextNode() != head && d.compareTo(current.getNextNode().getData()) == -1) {

            current = current.getNextNode();
        }

        newNode = new Node<>(d, current.getNextNode());
        current.setNextNode(newNode);
    }

    
    public void route(){
    
    
    }

}
