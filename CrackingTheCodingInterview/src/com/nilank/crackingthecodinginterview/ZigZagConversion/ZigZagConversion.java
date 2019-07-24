/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.ZigZagConversion;

/**
 *
 * @author nilan
 */
public class ZigZagConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        int num = 5;
        Solution sol = new Solution();
        System.out.println(sol.convert(str, num));
    }
    
}
