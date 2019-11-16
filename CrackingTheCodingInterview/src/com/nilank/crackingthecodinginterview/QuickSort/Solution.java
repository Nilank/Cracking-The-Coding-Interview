/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.QuickSort;

import java.util.Arrays;

/**
 *
 * @author nilan
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] unsorted = {6, 5, 3, 1, 8, 7, 2, 4}; 
        System.out.println("Unsorted array :" + Arrays.toString(unsorted));
        
        QuickSort algo = new QuickSort();
        algo.sort(unsorted);
        System.out.println("Sorted array :" + Arrays.toString(unsorted));

    }
    
}
