package org.example.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;


public class Node {

    public int data;
    public Node nextNode;

    public Node (int data){
        this.data =data;
        this.nextNode=null;
    }

}
