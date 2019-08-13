/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.LongestCommonPrefix;

import java.util.Arrays;

/**
 *
 * @author nilan
 */
public class Solution {
    public String longestCommonPrefix(String[] strs){
        StringBuilder result = new StringBuilder();
        
        if(strs != null && strs.length > 0){
            Arrays.sort(strs);
            char[] a = strs[0].toCharArray();
            char[] b = strs[strs.length - 1].toCharArray();
            
            for(int i=0; i<a.length; i++){
                if(b.length > i && a[i]==b[i]){
                    result.append(b[i]);
                }else{
                    return result.toString();
                }
            }
        }
        return result.toString();
    }
    
}
