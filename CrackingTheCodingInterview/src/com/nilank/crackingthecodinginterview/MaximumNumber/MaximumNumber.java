/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.MaximumNumber;

/**
 *
 * @author nilan
 */
public class MaximumNumber {

    public String solution(String message, int K) {
        StringBuilder sb = new StringBuilder();
        String[] msgArr = message.split("\\s+");
        boolean firstWord = true;
        for (String word : msgArr) {
            if (sb.length() + 1 + word.length() > K) {
                break;
            }
            if (!firstWord) sb.append(" ");
            else firstWord = false;
            sb.append(word);
        }
        return sb.toString();
    }

}
    
