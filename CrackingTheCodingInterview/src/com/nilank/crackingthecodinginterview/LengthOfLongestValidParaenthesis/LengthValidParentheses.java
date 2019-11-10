
package com.nilank.crackingthecodinginterview.LengthOfLongestValidParaenthesis;

import java.util.Stack;

public class LengthValidParentheses {
    public int longestValidParentheses(String str){
        int len = str.length();
        
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        
        int result =0;
        
        for(int i=0; i<len; i++){
            if(str.charAt(i) == '('){
                stack.push(i);
            }else{
                stack.pop();
                if(!stack.empty()){
                    result = Math.max(result, i-stack.peek());
                }else{
                    stack.push(i);
                }
            }
        }
        
        return result;
    }
    
}
