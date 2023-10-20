/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author dwikyhutomo
 */
public class LinkedListData {

    Node head;

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }

    }
    
    public void addFirst(int data){
        Node newNode= new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        Node temp = this.head;
        if (this.head == null) {
            this.head = newNode;
        }
        else if(this.head.next==null){
            this.head.next=newNode;
        }
        else{
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;     
        }
  
    }
    public void addAfter(int data,int target){
        Node newNode=new Node(data);
        Node temp=head;
        while(temp!=null){
            if(temp.data==target){
                newNode.next=temp.next;
                temp.next=newNode;
                break;
                }
            temp=temp.next;
        }
        
    }
    public void addBefore(int data,int target){
        Node newNode=new Node(data);
        Node temp=head;
        while(temp!=null){
            if(temp.next.data==target){
                newNode.next=temp.next;
                temp.next=newNode;
                break;
                }
            temp=temp.next;
        }
        
    }
    public void deleteLast(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void display(){
        Node temp=head;
        while( temp !=null){
            
            System.out.println(temp.data);
            
            temp=temp.next;
        }
    }

}
