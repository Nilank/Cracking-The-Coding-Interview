
package com.nilank.crackingthecodinginterview.CheckNumberInArray;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author nilan
 */
public class CheckNumberArray {
    public boolean isExist(int[] arr, int target){
        List inputList = Arrays.asList(arr);
        if(inputList.contains(target))
            return true;
        return false;
    }

}
