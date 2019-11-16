/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.QuickSort;

/**
 *
 * @author nilan
 */
public class QuickSort {
    
    private int[] input;
    private int length;
    
    public void sort(int[] numbers){
        if(numbers == null || numbers.length == 0){
            return;
        }
        length = numbers.length;
        this.input = numbers;
        quickSort(0, length - 1);
        
    }
    
    public void quickSort(int low, int high){
        int i = low;
        int j = high;
        
        int pivot = input[low + (high-low)/2];
        while(i<=j){
            while(input[i] < pivot){
                i++;
            }
            while(input[j]>pivot){
                j--;
            }
            if(i<=j){
                swap(i,j);
                i++;
                j--;
            }
        }
        if(low<j){
            quickSort(low,j);
        }
        if(i<high){
            quickSort(i, high);
        }
    }
    private void swap(int i, int j){
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
        
    }
    
}
