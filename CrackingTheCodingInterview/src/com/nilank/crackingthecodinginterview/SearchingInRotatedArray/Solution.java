/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.SearchingInRotatedArray;

/**
 *
 * @author nilan
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[]{4,5,6,7,0,1,2};
        int target = 0;
        SearchRotatedArray search = new SearchRotatedArray();
        System.out.println(search.searchInArray(arr, target));
    }
    
}
