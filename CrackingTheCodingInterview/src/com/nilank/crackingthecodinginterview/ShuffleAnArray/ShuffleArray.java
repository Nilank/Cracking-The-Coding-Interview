
package com.nilank.crackingthecodinginterview.ShuffleAnArray;

import java.util.Random;

/**
 *
 * @author nilan
 */
public class ShuffleArray {
    private int[] nums;
    private Random rand;
    
    public ShuffleArray(int[] nums){
        this.nums = nums;
        this.rand = new Random();
    }
    
    public int[] reset(){
        return nums;
    }
    
    public int[] shuffle(){
        if(nums == null)
            return null;
        int[] a = nums.clone();
        for(int j=1; j<a.length; j++){
            int i = rand.nextInt(j+1);
            swap(a,i,j);
        }
        return a;          
    }
    
    private void swap(int[] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
