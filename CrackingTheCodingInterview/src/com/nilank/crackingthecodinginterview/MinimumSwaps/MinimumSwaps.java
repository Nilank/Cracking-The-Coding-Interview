
package com.nilank.crackingthecodinginterview.MinimumSwaps;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author nilan
 */
public class MinimumSwaps {
    public int swaps(int[] arr){
        int count = 0;
        if(arr == null || arr.length == 0){
            System.out.println("Input cannot be empty");
        }
        
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    count++;
                }
                
            }
        }
        System.out.println(Arrays.toString(arr));
        return count;
    }
    
}
