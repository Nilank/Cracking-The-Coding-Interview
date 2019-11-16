
package com.nilank.crackingthecodinginterview.FirstNonRepeatingCharacter;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author nilan
 */
public class FirstNonRepeatingCharacter {
    public char firstCharacter(String s){
        Map<Character, Integer> map = new LinkedHashMap<>(s.length());
        for(char c : s.toCharArray()){
            map.put(c, map.containsKey(c) ? map.get(c)+1 : 1);
        }
        for(Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1)
                return entry.getKey();
        }
        throw new RuntimeException("didn't find any non repeated Character");
    }

}
