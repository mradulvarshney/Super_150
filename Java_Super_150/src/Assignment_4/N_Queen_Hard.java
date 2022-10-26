package Assignment_4;
import java.util.*;

public class N_Queen_Hard
{
    static int count = 0;
    public static void main(String args[])
    {
        count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NQueen(new boolean[n][n], 0, 0, n);
        System.out.println(count);
    }

    public static void NQueen(boolean[][] board, int row, int qpsf, int tq)
    {
        if(qpsf == tq)
        {
            count++;
            return;
        }
        for (int col = 0; col < board.length; col++)
        {
            if (isItSafeToPlaceTheQueen(board, row, col))
            {
                board[row][col] = true;
                NQueen(board, row + 1, qpsf+1, tq);
                board[row][col] = false;
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
