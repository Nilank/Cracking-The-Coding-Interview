/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.RearrangementOfArrayPositiveNegative;

import java.util.Arrays;

/**
 *
 * @author nilan
 */
public class RearrangementArray {
    public void alternatePositiveNegative(int[] arr){
        if(arr == null || arr.length == 0)
            System.out.println("Invalid Input");
        
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length; j++){
                if(arr[i] < arr[j] || arr[i] == -arr[j] || -arr[i] == arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
