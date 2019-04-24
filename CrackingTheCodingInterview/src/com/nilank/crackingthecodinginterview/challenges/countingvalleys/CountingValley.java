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
public class CountingValley {
    
    public int countingValley(int n, String s){
        int currentLevel =0, valley=0;
        for(char c: s.toCharArray()){
            if(c == 'U') ++currentLevel;
            if(c == 'D') --currentLevel;
            if(currentLevel == 0 && c == 'U'){
                ++valley;
            }
        }
        return valley;
        
    }
    
}
