package com.linkedlist.stackandqueue;

class Node1{
    int data1;
    Node1 next1;
    public Node1(int data1){
        this.data1 = data1;
        next1 = null;
    }
}
public class Myqueue {
    Node1 head1;
    public Myqueue(){
        head1 = null;
    }
    //Add node at the end
    public void add(int val){
        Node1 newnode1 = new Node1(val);
        Node1 current1 = head1;
        if(head1 == null){
            head1 = newnode1;
        }
        else{
            if(head1 != null && head1.next1 == null){
                head1.next1 = newnode1;
            }
            else{
                while(current1.next1 != null){
                    current1 = current1.next1;
                }
                current1.next1 = newnode1;
            }
        }

    }
    public void display(){
        Node1 temp = head1;
        while(temp != null){
            System.out.print(temp.data1 + "->");
            temp = temp.next1;
        }
        System.out.print("END");
    }
}
