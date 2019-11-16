/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.FindIntersectionInArray;

/**
 *
 * @author nilan
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr1 = {21, 34, 41, 892, 35} ;
        int[] arr2 =  {108, 34, 990, 210, 1110};
        FindIntersection intersection = new FindIntersection();
        intersection.intersection(arr1, arr2);
    }
    
}
