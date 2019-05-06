/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.challenges.jumpingonclouds;

/**
 *
 * @author nilan
 */
public class Cloud {
    
    public static int jumpingOnTheClouds(int[] c){
        int jumps = 0;
        for(int i=0; i<c.length-1; i++){
            jumps++;
            if(i+2<c.length && c[i+2]==0){
                i++;
            }
        }
        return jumps++;
    }
    
}
