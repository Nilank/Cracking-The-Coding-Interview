/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.challenges.sockmerchant;

/**
 *
 * @author nilan
 */
public class Solution {
    
    private static int[] differentSocks = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};

    public static void main(String[] args) {
        System.out.println(SockMerchant.sockMerchant(9, differentSocks));
    }
    
}
