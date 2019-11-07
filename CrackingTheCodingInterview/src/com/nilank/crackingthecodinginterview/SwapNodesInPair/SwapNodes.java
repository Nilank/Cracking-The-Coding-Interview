/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.SwapNodesInPair;

/**
 *
 * @author nilan
 */
public class SwapNodes {

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
    
    public void swapNodes(){
        Node temp = head;
        while(temp != null && temp.next != null){
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
            
        }
    }

    public static void main(String[] args) {
        SwapNodes swapNodes = new SwapNodes();
        swapNodes.push(7);
        swapNodes.push(1);
        swapNodes.push(3);
        swapNodes.push(2);
        swapNodes.push(8);
        
        System.out.println("\nCreated LinkedList is: ");
        swapNodes.printList();
        
        swapNodes.swapNodes();
        System.out.println("\nLinked List After Swapping: ");
        swapNodes.printList();
    }

}
