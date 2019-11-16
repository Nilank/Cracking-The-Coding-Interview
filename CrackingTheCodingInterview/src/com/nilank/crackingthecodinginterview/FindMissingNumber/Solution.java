/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.FindMissingNumber;

/**
 *
 * @author nilan
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] arr = {4,3,2,7,8,2,3,1};
       int count = 10;
       MissingNumber number = new MissingNumber();
       number.findMissingNumberBitSet(arr, count);
       number.findMissingNumber(arr);
        System.out.println("missing number in array of size n containing numbers from 1 to n only " + number.findOneMissingNumberFromOnetoN(arr, count));
    }
    
}
