/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.ThreeSum;

import java.util.Arrays;

/**
 *
 * @author nilan
 */
public class ThreeSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] input = new int[]{-1,0,1,2,-1,-4};
        Solution sol = new Solution();
        System.out.println((sol.threeSum(input)));
    }
    
}
