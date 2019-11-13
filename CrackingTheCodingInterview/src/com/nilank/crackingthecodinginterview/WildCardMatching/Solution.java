
package com.nilank.crackingthecodinginterview.WildCardMatching;

/**
 *
 * @author nilan
 */
public class Solution {

    public static void main(String[] args) {
        String s = "cb";
        String p = "?a";
        WildCardMatching matching = new WildCardMatching();
        System.out.println(matching.isMatch(s, p));
    }
    
}
