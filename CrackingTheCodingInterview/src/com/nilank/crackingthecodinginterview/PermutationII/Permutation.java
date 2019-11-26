/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.PermutationII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author nilan
 */
public class Permutation {
    public List<List<Integer>> permuteUnique(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, new boolean[nums.length]);
        return list;
    }
    
    public void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, boolean[] used){
        if(nums.length == tempList.size()){
            list.add(new ArrayList<>(tempList));
        }else{
            for(int i=0; i<nums.length; i++){
                if(used[i] || i>0 && nums[i] == nums[i-1] && !used[i-1]) continue;
                used[i] = true;
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, used);
                used[i] = false;
                tempList.remove(tempList.size()-1);
            }
        }
    }
    
}
