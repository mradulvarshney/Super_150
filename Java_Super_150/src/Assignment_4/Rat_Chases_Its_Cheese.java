package Assignment_4;
import java.util.Scanner;

public class Rat_Chases_Its_Cheese
{
    static boolean f;
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        char[][] maze = new char[n][m];
        for(int i=0; i<maze.length; i++)
        {
            String str = scan.next();
            for(int j=0; j<str.length(); j++)
            {
                maze[i][j] = str.charAt(j);
            }
        }
        int[][] ans = new int[n][m];
        hasPath(maze, 0, 0, ans);
        if(f==false)
            System.out.println("NO PATH FOUND");
    }

    public static void hasPath(char[][] maze, int cc, int cr, int[][] ans)
    {
        if(cr==maze.length-1 && cc==maze[0].length-1 && maze[cr][cc] != 'X')
        {
            ans[cr][cc] = 1;
            f = true;
            display(ans);
            return;
        }
        if(cr<0 || cc<0 || cr>=maze.length || cc>=maze[0].length || maze[cr][cc] == 'X')
        {
            return;
        }
        maze[cr][cc] = 'X';
        ans[cr][cc] = 1;
        hasPath(maze, cc, cr-1, ans); //up
        hasPath(maze, cc, cr+1, ans); //down
        hasPath(maze, cc-1, cr, ans); //left
        hasPath(maze, cc+1, cr, ans); //right
        maze[cr][cc] = '0';
        ans[cr][cc] = 0;
    }

    public static void display(int[][] ans)
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
