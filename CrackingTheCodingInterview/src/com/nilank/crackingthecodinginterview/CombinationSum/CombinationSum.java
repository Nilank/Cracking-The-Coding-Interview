
package com.nilank.crackingthecodinginterview.CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author nilan
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }
    public void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] candidates, int remain, int start ){
        if(remain < 0 ) return;
        else if(remain == 0) list.add(new ArrayList<>(tempList));
        else{
            for(int i=start; i<candidates.length; i++){
                tempList.add(candidates[i]);
                backtrack(list, tempList, candidates, remain-candidates[i], i);
                tempList.remove(tempList.size()-1);
            }
        }
    }
    
}
