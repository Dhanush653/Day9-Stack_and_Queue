package com.linkedlist.stackandqueue;

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Mystack {
    Node head;
    public Mystack() {
        this.head = null;
    }
    // Add Node At The Beginning
    public void add(int val){
        Node newnode = new Node(val);
        if(head == null){
            head = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
    }
    public void display(){
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
