/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.NextPermutation;

/**
 *
 * @author nilan
 */
public class Permutation {
    
    public void nextPermuation(int[] nums){
        if(nums.length <= 1 && nums == null) return;
        int len = nums.length - 2;
        while(len>=0 && nums[len]>=nums[len +1]) len--;
        if(len>=0){
            int j = nums.length - 1;
            while(nums[j] <= nums[len]) j--;
            swap(nums, len, j);
        }
        reverse(nums, len+1, nums.length-1);
        
    }
    
    public void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;   
    }
    public void reverse(int[] nums, int i, int j){
        while(i<j) swap(nums,i++, j--);  
    }
}
