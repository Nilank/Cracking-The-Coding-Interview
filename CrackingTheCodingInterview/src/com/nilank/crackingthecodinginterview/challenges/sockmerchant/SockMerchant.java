
package com.nilank.crackingthecodinginterview.challenges.sockmerchant;

import java.util.HashSet;
import java.util.Set;


public class SockMerchant {
    
    public static int sockMerchant(int n, int[] arr){
        int pairs = 0;
        Set<Integer> colors = new HashSet<>();
        for(int i=0; i<n; i++){
            if(!colors.contains(arr[i])){
                colors.add(arr[i]);
            }else{
                pairs++;
                colors.remove(arr[i]);
            }
        }
        return pairs++;
    }
    
}
 