/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.challenges.equalizeArray;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author nilan
 */
public class HelperClass {
    
    public int equalizeArray(int[] arr){
        int max =1;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            if(!map.containsKey(i)){
                map.put(i, 1);
                
            }else{
                map.put(i, map.get(i)+1);
                if(max < map.get(i)){
                    max = map.get(i);
                }
            }
        }
        
        return arr.length - max;
        
    }
    
}
