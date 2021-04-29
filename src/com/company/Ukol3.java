package com.company;

import java.util.Arrays;

public class Ukol3 {
    public static void main(String[] args) {
        String maze = "" +
                "" +
                "[S, #, O]\n" +
                "[O, O, #]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, F, O]\n" +
                "\n";
        String[] mazeArr = maze.split("\n");
        char[][] mazeChar = new char[mazeArr.length][3];
        for (int i = 0; i < mazeArr.length; i++) {
            char[] a = mazeArr[i].toCharArray();
            mazeChar[i] = new char[]{a[1], a[4], a[7]};
        }

        char ac = mazeChar[0][0];
        int movesCount = 0;
        int x = 0;
        int y = 0;

        while(ac != 'F') {
            if(valid(mazeChar, x, y+1) && (mazeChar[y+1][x] == 'O' || mazeChar[y+1][x] == 'F')) {
                y +=1;
                ac = mazeChar[y][x];
            } else if(valid(mazeChar, x+1, y) && (mazeChar[y][x+1] == 'O' || mazeChar[y][x+1] == 'F')) {
                x +=1;
                ac = mazeChar[y][x];
            }else if(valid(mazeChar, x-1, y) && (mazeChar[y][x-1] == 'O' || mazeChar[y][x-1] == 'F')) {
                x -=1;
                ac = mazeChar[y][x];
            }
            movesCount++;
        }

        System.out.println(movesCount);
    }

    private static boolean valid(char[][] maze, int x, int y) {
        return x >= 0 && y >= 0 && y < maze.length && x < maze[0].length;
    }
}
