package Assignment_4;

import java.util.*;

public class Rat_In_Maze
{
    static int t = 0;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        char[][] maze = new char[row][col];
        for(int i=0; i<maze.length; i++)
        {
            String str = sc.next();
            for(int j=0; j<maze[0].length; j++)
            {
                maze[i][j] = str.charAt(j);
            }
        }
        mazeSolution(maze, 0, 0, new int[row][col]);
        if(t==0)
        {
            System.out.println("-1");
        }
    }
    private static void mazeSolution(char[][] maze, int row, int col, int[][] ans)
    {
        if(t==0)
        {
            if(row == maze.length-1 && col == maze[0].length-1)
            {
                ans[row][col] = 1;
                t=1;
                display(ans);
                return;
            }
            if(row == maze.length || col==maze[0].length || maze[row][col] == 'X' || ans[row][col] == 1)
            {
                return;
            }

            ans[row][col] = 1;
            mazeSolution(maze, row, col+1, ans);
            mazeSolution(maze, row+1, col, ans);
            ans[row][col] = 0;
        }
    }
    private static void display(int[][] ans)
    {
        for(int i=0; i<ans.length; i++)
        {
            for(int j=0; j<ans[0].length; j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}

