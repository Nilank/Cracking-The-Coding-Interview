/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.ThirdMaximumNumber;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums){
        if(nums.length ==0 || nums == null)
            return 0;
        
        Integer max1 = null, max2 = null, max3 = null;
        for(Integer n : nums){
            if(n.equals(max1) || n.equals(max2) || n.equals(max3))
                continue;
            
            if(max1 == null || n > max1 ){
                max3 = max2;
                max2 = max1;
                max1 = n;
            }
            else if(max2 == null || n > max2){
                max3 = max2;
                max2 = n;
            }
            else if(max3 == null || n > max3){
                max3 = n;
            }
        }
        return max3 == null ? max1 : max3;
        
    }
    
}
