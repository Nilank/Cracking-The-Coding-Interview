/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.ShuffleAnArray;

import java.util.Arrays;

/**
 *
 * @author nilan
 */
public class Solution {

    public static void main(String[] args) {
        int nums[] = {1,2,3};
        ShuffleArray shuffleArray = new ShuffleArray(nums);
        String result = Arrays.toString(shuffleArray.shuffle());
        String reset = Arrays.toString(shuffleArray.reset());
        System.out.println(result);
        System.out.println(reset);
    }
    
}
