/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.FindMissingNumber;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/**
 *
 * @author nilan
 */
public class MissingNumber {
    public List<Integer> findMissingNumber(int[] arr){
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            int index = Math.abs(arr[i]) -1;
            
            if(arr[index]>0){
                arr[index] = -arr[index];
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0)
                res.add(i+1);
        }
        return res;
    }
    
    public static void findMissingNumberBitSet(int[] arr, int count){
        int missingCount = count - arr.length;
        BitSet bitset = new BitSet(count);
        for(int number : arr){
            bitset.set(number -1);
        }
        
        System.out.printf("Missing numbers in integer array %s, with total number is %n", count);
        int lastMissingIndex = 0;
        for(int i=0; i<missingCount; i++){
            lastMissingIndex = bitset.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }

    }
    
       /**
    * Java method to find missing number in array of size n containing
    * numbers from 1 to n only.
    * can be used to find missing elements on integer array of 
    * numbers from 1 to 100 or 1 - 1000
    */
    
    public int findOneMissingNumberFromOnetoN(int[] arr, int count){
        int expectedSum = count * ((count + 1)/2);
        int actualSum = 0;
        for(int num : arr){
            actualSum += num;
        }
        
        return expectedSum - actualSum;
    }


    
}
