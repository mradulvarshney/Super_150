package Assignment_4;
import java.util.*;

public class N_Queen_Problem
{
    static int count = 0;
    public static void main(String args[])
    {
        count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NQueen(new boolean[n][n], 1, 0, n, "");
        System.out.println("\n"+ count);
    }

    public static void NQueen(boolean[][] board, int row, int qpsf, int tq, String ans)
    {
        if(qpsf == tq)
        {
            System.out.print(ans+" ");
            count++;
            return;
        }
        for (int col = 1; col <= board.length; col++)
        {
            if (isItSafeToPlaceTheQueen(board, row-1, col-1))
            {
                board[row-1][col-1] = true;
                NQueen(board, row + 1, qpsf+1, tq, ans+"{"+row+"-"+col+"} ");
                board[row-1][col-1] = false;
            }

        }
    }

    public static boolean isItSafeToPlaceTheQueen(boolean[][] board, int row, int col)
    {
        int r = row-1;
        int c = col;
        while(r>=0)
        {
            if(board[r][c])
            {
                return false;
            }
            r--;
        }
        r = row;
        c = col-1;
        while(c>=0)
        {
            if(board[r][c])
            {
                return false;
            }
            c--;
        }

        r = row-1;
        c = col-1;

        while(r>=0 && c>=0)
        {
            if(board[r][c])
            {
                return false;
            }
            r--;
            c--;
        }

        r = row-1;
        c = col+1;

        while(r>=0 && c<board[0].length)
        {
            if(board[r][c])
            {
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
}
