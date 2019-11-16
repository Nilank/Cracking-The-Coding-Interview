
package com.nilank.crackingthecodinginterview.FindMaxMinNumber;

/**
 *
 * @author nilan
 */
public class MaxMinNumber {
    public void largestSmallestNumber(int[] arr){
        int maximumNumber = Integer.MIN_VALUE;
        int minimumNumber = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > maximumNumber){
                maximumNumber = arr[i];
            }else if(arr[i] < minimumNumber){
                minimumNumber = arr[i];
            }
            
        }
        System.out.println("The Maximum Number in this array is " + maximumNumber);
        System.out.println("The Minimum Number in this array is " + minimumNumber);
        
    }
    
}
