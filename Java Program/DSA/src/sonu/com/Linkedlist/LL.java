package sonu.com.Linkedlist;

import org.w3c.dom.Node;

import java.lang.classfile.components.ClassPrinter;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int data){
        Node node =new Node(data);
        node.next = head;
        head =node;

        if (tail == null){
            tail =head;
        }

        size +=1;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node =new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int data;
        private Node  next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }


}


