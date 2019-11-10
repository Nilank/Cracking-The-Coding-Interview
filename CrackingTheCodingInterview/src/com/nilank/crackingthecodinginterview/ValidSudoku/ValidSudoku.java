/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nilank.crackingthecodinginterview.ValidSudoku;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author nilan
 */
public class ValidSudoku {

    public boolean sudoku(char[][] board) {
        Set seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    String b = "(" + board[i][j] + ")";
                    if (!seen.add(b + i) || (!seen.add(b + j)) || (!seen.add(i / 3 + b + j / 3))) {
                        return false;
                    }
                }
            }
        }
        return true;

    }

}
