
package com.nilank.crackingthecodinginterview.FirstRepeatingNumber;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nilan
 */
public class FirstRepeatingNumber {
    public int firstRepeating(int[] arr){
        if(arr == null || arr.length == 0)
            System.out.println("Invalid Input");
        
        int len = arr.length;
        List list = new ArrayList();
        for(int i=0; i<len; i++){
            for(int j=1; j<len; j++){
                if(arr[i] == arr[j] && i<j){
                    list.add(arr[i]);
                }
            }

        }
        return (int) list.get(0);

    }
    
}
