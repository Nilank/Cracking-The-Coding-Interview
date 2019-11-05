/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.MedianSortedArray;

/**
 *
 * @author nilan
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] arr1 = new int[]{1,3};
       int[] arr2 = new int[]{2};
       
       MedianofSortedArrays median = new MedianofSortedArrays();
        System.out.println(median.findMedianSortedArrays(arr1, arr2));
    }
    
}
