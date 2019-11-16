
package com.nilank.crackingthecodinginterview.FindPairsSumTarget;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author nilan
 */
public class FindAllPairs {
    public void findAllPairs(int[] arr, int target){
        if(arr == null || arr.length == 0)
            System.out.println("Invalid Input");

        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.printf("(%d, %d) %n", arr[i], arr[j]);
                }
            }
        }
        
    }
    
    public void findPairsSet(int[] arr, int n){
        if(arr == null || arr.length == 0)
            System.out.println("Invalid input");
        
        Set set = new HashSet(arr.length);
        for(int value : arr){
            int target = n - value;
            
            if(!set.contains(target))
                set.add(value);
            else
                System.out.printf("(%d, %d) %n", value, target);
        }
        
    }
    
}
