/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.FindTopTwoNumbers;

import java.util.Arrays;

/**
 *
 * @author nilan
 */
public class TopTwoNumbers {
    public void twoNumbers(int[] arr){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        if(arr == null || arr.length == 0)
            System.out.println("Invalid input");
        
        for(int number : arr){
            if(number > max1){
                max2 = max1;
                max1 = number;
            }else if(number > max2){
                max2 = number;
            }
        }
        System.out.println("Given integer array : " + Arrays.toString(arr));
        System.out.println("First maximum number is : " + max1);
        System.out.println("Second maximum number is : " + max2);
    }
    
}
