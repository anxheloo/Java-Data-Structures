package com.amigoscode;

import java.util.Arrays;

public class WorkingWith2DArrays {

    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for(int i = 0;i<3;i++)
        {
            for(int y=0;y<3;y++)
            {
                board[i][y] = '-';
            }
        }

        //Instead of filling the values with nested loop we can also use :
        char[][]boardTwo = new char[][]
                {
                        new char[] {'0','-','-'},
                        new char[] {'0','-','-'},
                        new char[] {'0','-','-'}
                };

        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';

        //To print 2d Arrays instead of Arrays.ToString , we use Arrays.deepToString
        System.out.println(Arrays.deepToString(board));

        System.out.println(Arrays.deepToString(boardTwo));
    }
}
