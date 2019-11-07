/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.RemoveNthNodeFromEndOfList;

/**
 *
 * @author nilan
 */
public class ListNode {

    Node head;

    class Node {

        Node head;
        Node next;
        int data;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }
    
    public void removeNthFromEnd(int position){
        Node first = head;
        Node second = head;
        for(int i=0; i<position; i++){
            if(second.next == null){
                if(i==position-1)
                    head = head.next;
                return;
            }
            second = second.next;
        }
        while(second.next!=null){
            first = first.next;
            second = second.next;
        }
        
        first.next = first.next.next;
    }
    
        public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.push(7);
        listNode.push(1);
        listNode.push(3);
        listNode.push(2);
        listNode.push(8);
        
        System.out.println("\nCreated LinkedList is: ");
        listNode.printList();
        
        listNode.removeNthFromEnd(1);
        System.out.println("\nLinked List after Deletion at position 4: ");
        listNode.printList();
 
    }
}
