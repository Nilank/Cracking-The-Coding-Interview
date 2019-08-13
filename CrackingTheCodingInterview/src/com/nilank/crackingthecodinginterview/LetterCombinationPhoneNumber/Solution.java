
package com.nilank.crackingthecodinginterview.LetterCombinationPhoneNumber;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author nilan
 */
public class Solution {
    
    public List letterCombination(String digits){
        
        LinkedList<String> result = new LinkedList<>();
        
        if(digits == null || digits.length() == 0)
            return result;
        
        String[] strsMap = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        result.add("");
        
        for(int i=0; i<digits.length(); i++){
            int x = Character.getNumericValue(digits.charAt(i));
            while(result.peek().length() == i){
                String t = result.remove();
                for(char c : strsMap[x].toCharArray()){
                    result.add(t+c);
                }
                
            } 
        }
        return result;
        
    }
    
}
