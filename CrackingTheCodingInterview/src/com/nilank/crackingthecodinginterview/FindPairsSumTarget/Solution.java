/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.FindPairsSumTarget;


/**
 *
 * @author nilan
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = {2,4,3,5,7,8,9};
        int target = 7;
        FindAllPairs pairs = new FindAllPairs();
        pairs.findAllPairs(numbers, target);
        System.out.println("---------------------------------------------------");
        pairs.findPairsSet(numbers, target);
        
    }
    
}
