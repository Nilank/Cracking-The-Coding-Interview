/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.RotateImageArray;

import java.util.Arrays;

/**
 *
 * @author nilan
 */
public class RotateImage {
    public void rotate(int[][] matrix){
        int n = matrix.length;
        System.out.println("Length of matrix " + n);
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][i];
                matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
                matrix[j][n-i-1] = temp;
            }
        }
        System.out.println("Result " + Arrays.deepToString(matrix));
    }
}
