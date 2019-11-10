
package com.nilank.crackingthecodinginterview.SearchInsertPosition;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target){
        if(nums == null || nums.length == 0)
            return 0;
        
        int left = 0, right = nums.length -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid] == target)
                return mid;
            
            else if(nums[mid]>target)
                right = mid-1;
            
            else
                left = mid+1;
        }
        return left;
    }
    
}
