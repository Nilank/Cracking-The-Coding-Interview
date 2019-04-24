/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.challenges.countingvalleys;

/**
 *
 * @author nilan
 */
public class Solution {
    
    private static int numberInputs = 8;
    private static String s = "UDDDUDUU";

    public static void main(String[] args) {
        CountingValley cv = new CountingValley();
        int result = cv.countingValley(numberInputs, s);
        System.out.println(result);
        
    }
    
}
