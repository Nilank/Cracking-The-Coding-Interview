/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.BinarySearchTree;

/**
 *
 * @author nilan
 */
public class BinarySearchTree {
    
    private Node node;
    
     boolean checkBST(Node root) {
        return check(root, Integer.MIN_VALUE, Integer.MAX_VALUE);    
    }

    boolean check(Node n, int min, int max){
        if(n==null)
            return true;
        if(n.getData()<=min || n.getData()>=max){
            return false;
        }
        return check(n.left, min, n.getData()) && check(n.right,n.getData(), max);
    }

    
}
