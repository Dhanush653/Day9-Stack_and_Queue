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
    public void push(int val){
        Node newnode = new Node(val);
        if(head == null){
            head = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
    }
    //Remove the topmost Node
    public void pop(){
        head = head.next;
    }
    //Print The topmost Node
    public void peak(){
        System.out.println(head.data);
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
