
package com.nilank.crackingthecodinginterview.RandomPickIndex;

/**
 *
 * @author nilan
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3};
        int target = 3;
        RandomPickIndex pickIndex = new RandomPickIndex(nums);
        System.out.println(pickIndex.pick(target));
    }
    
}
