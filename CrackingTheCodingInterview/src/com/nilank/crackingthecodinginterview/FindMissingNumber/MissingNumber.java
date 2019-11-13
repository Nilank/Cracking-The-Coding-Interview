/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.FindMissingNumber;

import java.util.ArrayList;
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
    
}
