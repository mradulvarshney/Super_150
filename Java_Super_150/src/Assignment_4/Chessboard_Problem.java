package Assignment_4;
import java.util.*;

public class Chessboard_Problem
{
    static int count = 0;
    public static void main(String args[])
    {
        count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        chessBoard(n, 0, 0, "{"+0+"-"+0+"}");
        System.out.println("\n"+ count);
    }
    private static void chessBoard(int n, int row, int col, String ans)
    {
        if(row == n-1 && col == n-1)
        {
            System.out.print(ans+ " ");
            count++;
            return;
        }
        if(col >= n || row >= n)
        {
            return;
        }

        chessBoard(n, row+2, col+1, ans+"K{"+(row+2)+"-"+(col+1)+"}");
        chessBoard(n, row+1, col+2, ans+"K{"+(row+1)+"-"+(col+2)+"}");
        if(row == 0 || row == n-1 || col == 0 || col == n-1)
        {
            for(int i=1; i<n; i++)
            {
                chessBoard(n, row, col+i, ans+"R{"+(row)+"-"+(col+i)+"}");
            }
            for(int i=1; i<n; i++)
            {
                chessBoard(n, row+i, col, ans+"R{"+(row+i)+"-"+(col)+"}");
            }
        }
        if(row == col || row+col == n-1)
        {
            for(int i=1; i<n; i++)
            {
                chessBoard(n, row+i, col+i, ans+"B{"+(row+i)+"-"+(col+i)+"}");
            }
        }
    }
}
