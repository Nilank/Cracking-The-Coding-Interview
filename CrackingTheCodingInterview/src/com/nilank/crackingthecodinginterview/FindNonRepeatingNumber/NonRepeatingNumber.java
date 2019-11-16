/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.FindNonRepeatingNumber;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author nilan
 */
public class NonRepeatingNumber {
    public void nonRepeatingNumber(int[] arr){
        if(arr == null || arr.length == 0){
            System.out.println("Invalid Input");
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int number : arr){
            map.put(number, map.containsKey(number) ? map.get(number) + 1 : 1);
        }
        for(Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println("The first non repeating number is " + entry.getKey());
            }
            
        }
        
    }
    
}
