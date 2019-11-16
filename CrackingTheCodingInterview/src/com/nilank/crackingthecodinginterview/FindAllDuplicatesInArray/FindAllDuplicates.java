/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.FindAllDuplicatesInArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author nilan
 */
public class FindAllDuplicates {
    public List<Integer> findDuplicates(int[] arr){
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            int index = Math.abs(arr[i])-1;
            if(arr[index]<0)
                res.add(Math.abs(index+1));
            arr[index] = -arr[index];     
        
        }
        return res;
        
    }
    
    public boolean isDuplicate(int[] arr){
        List list = Arrays.asList(arr);
        Set set = new HashSet(list);
        if(set.size() < list.size())
            return true;
        
        return false;

    }
}
