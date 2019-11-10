/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.findfirstandlastposition;

/**
 *
 * @author nilan
 */
public class FindFirstLast {
    public int[] searchRange(int[] nums, int target){
        if(nums == null || nums.length == 0)
            return new int[]{-1,-1};
        
        int len = nums.length;
        int first = -1, last = -1;
        
        for(int i=0; i<len; i++){
            if(target != nums[i])
                continue;
            
            if(first == -1)
                first = i;
            last = i;    
        }
        if(first != -1)
            return new int[]{first,last};
        else{
            return new int[]{-1,-1};
        }
    }
    
}
