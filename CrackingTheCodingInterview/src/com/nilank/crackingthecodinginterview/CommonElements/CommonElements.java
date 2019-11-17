/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.CommonElements;


/**
 *
 * @author nilan
 */
public class CommonElements {
    public void commonElements(int[] arr1, int[] arr2, int[] arr3){
        if(arr1 == null || arr1.length == 0 
                || arr2 == null || arr2.length == 0 
                || arr3.length == 0 || arr3 == null){
            System.out.println("Invalid Input");
        }
        
        int i=0, j=0, k=0;
        while(i<arr1.length && j <arr2.length && k<arr3.length){
            if(arr1[i] == arr2[j] && arr2[j] == arr3[k]){
                System.out.print(arr1[i]+" ");   i++; j++; k++;
            }
            
            else if(arr1[i] < arr2[j])
                i++;
            
            else if(arr2[j] < arr3[k])
                j++;
            
            else
                k++;
                        
        }
        
    }
}
