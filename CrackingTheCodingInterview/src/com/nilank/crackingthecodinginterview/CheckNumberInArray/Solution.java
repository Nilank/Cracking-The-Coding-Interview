/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.CheckNumberInArray;

/**
 *
 * @author nilan
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        CheckNumberArray check = new CheckNumberArray();
        System.out.println(check.isExist(arr, 7));
    }
    
}
