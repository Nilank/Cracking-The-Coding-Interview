/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.TrappingRainWater;

/**
 *
 * @author nilan
 */
public class TrappingRainWater {
    public int getRainWater(int[] height){
        int a =0, b = height.length -1, leftMax = 0, rightMax = 0;
        int max =0;
        while(a<=b){
            leftMax = Math.max(leftMax, height[a]);
            rightMax = Math.max(rightMax, height[b]);
            if(leftMax < rightMax){
                max += (leftMax - height[a]);
                a++;
            }else{
                max += (rightMax - height[b]);
                b--;
            }
        }
        return max;
    }
    
    
}
