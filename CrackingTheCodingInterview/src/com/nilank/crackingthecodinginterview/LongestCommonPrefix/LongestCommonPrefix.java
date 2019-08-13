/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.LongestCommonPrefix;

/**
 *
 * @author nilan
 */
public class LongestCommonPrefix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        Solution sol = new Solution();
        String output = sol.longestCommonPrefix(strs);
        System.out.println(output);
    }
    
}
