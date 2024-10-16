package org.example.model;

import lombok.Data;

import java.sql.SQLOutput;


public class LinkedList {
    public Node head = null;
    public Node tail = null;

    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.nextNode=newNode;
            tail = newNode;
        }
    }
    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("empty");
            return;
        }
        while (current!=null){
            System.out.println(current.data);
            current= current.nextNode;
        }
    }
    public void removeLastNode(){
        Node current = head;
        while (current!=null){
            if(current.nextNode.nextNode==null){
                current.nextNode=null;
            }
            current= current.nextNode;
        }
    }
}
