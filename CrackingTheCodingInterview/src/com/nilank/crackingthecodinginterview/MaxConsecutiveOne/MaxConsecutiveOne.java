/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.MaxConsecutiveOne;

/**
 *
 * @author nilan
 */
public class MaxConsecutiveOne {
    public int findMaxConsecutiveOne(int[] nums){
        int maxHere = 0, max = 0;
        for(int n : nums){
            max = Math.max(max, maxHere = n == 0 ? 0 : maxHere + 1);
        }
        return max;
    }
}
