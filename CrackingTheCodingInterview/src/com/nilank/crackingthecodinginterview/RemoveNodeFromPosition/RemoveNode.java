/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.RemoveNodeFromPosition;

/**
 *
 * @author nilan
 */
public class RemoveNode {
    
    Node head;
    
    class Node {
    Node head;
    Node next;
    int data;
    
    Node(int d){
        data = d;
        next = null;    
    }   
}
    
    public void push(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }
    
    public void deleteNode(int position){
        if(head == null)return; 
        Node temp = head;
        if(position == 0){
            head = temp.next;
            return;
        }
        for(int i=0; temp!=null && i<position-1; i++)
            temp = temp.next;
        if(temp == null || temp.next == null)
            return;
        Node next = temp.next.next;
        temp.next = next;
    }
    
    public void printList(){
        Node tnode = head;
        while(tnode != null){
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        RemoveNode removeNode = new RemoveNode();
        removeNode.push(7);
        removeNode.push(1);
        removeNode.push(3);
        removeNode.push(2);
        removeNode.push(8);
        
        System.out.println("\nCreated LinkedList is: ");
        removeNode.printList();
        
        removeNode.deleteNode(4);
        System.out.println("\nLinked List after Deletion at position 4: ");
        removeNode.printList();
 
    }
    
}
