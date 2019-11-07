/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.SearchingInRotatedArray;

/**
 *
 * @author nilan
 */
public class SearchRotatedArray {
    public int searchInArray(int[]nums, int target){
        if(nums == null || nums.length == 0) return -1;
        int left = 0;
        int right = nums.length -1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target) return mid;
            
            if(nums[left] <= nums[mid]){
                if(nums[left]<=target && target < nums[right]){
                    right = mid -1;
                    
                }else{
                    left = mid+1;
                }
            }
            else{
                if(nums[mid]<target && target<=nums[right]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return -1;
    }
    
}
