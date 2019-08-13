/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.RemoveDuplicates;

/**
 *
 * @author nilan
 */
public class RemoveDuplicates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        Solution solution = new Solution();
        int result = solution.removeDuplicates(nums);
        System.out.println(result);
    }
    
}
