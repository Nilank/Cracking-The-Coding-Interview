
package com.nilank.crackingthecodinginterview.challenges.jumpingonclouds;

/**
 *
 * @author nilan
 */
public class Solution {
    
    private static int[] clouds = new int[]{0,0,1,0,0,1,0};

    public static void main(String[] args) {
        int result = Cloud.jumpingOnTheClouds(clouds);
        System.out.println(result);
        
       
    }
    
}
