
package com.nilank.crackingthecodinginterview.DiagonalTraverse;

import java.util.Arrays;

/**
 *
 * @author nilan
 */
public class Solution {

    public static void main(String[] args) {
       int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
       DiagonalTraverse traverse = new DiagonalTraverse();
       String result = Arrays.toString(traverse.findDiagonalOrder(matrix));
       System.out.println(result);
    }
    
}
