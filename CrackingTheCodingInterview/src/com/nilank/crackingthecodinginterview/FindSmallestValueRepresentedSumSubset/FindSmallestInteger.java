
package com.nilank.crackingthecodinginterview.FindSmallestValueRepresentedSumSubset;

/**
 *
 * @author nilan
 */
public class FindSmallestInteger {
    public int findSmallest(int[] arr){
        if(arr == null || arr.length == 0)
            return 0;
        
        int n = arr.length;
        int result = 1;
        for(int i=0; i<n && arr[i] <= result; i++){
            result += arr[i];
        }
        return result;
    }
    
}
