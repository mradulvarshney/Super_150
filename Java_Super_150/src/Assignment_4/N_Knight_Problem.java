package Assignment_4;
import java.util.*;

public class N_Knight_Problem
{
    static int count = 0;
    public static void main(String args[])
    {
        count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] board = new boolean[n][n];
        N_Knight(board, 0, 0, 0, n, "");
        System.out.println("\n"+ count);
    }

    private static void N_Knight(boolean[][] board, int row, int col, int kpsf, int tk, String ans)
    {
        if(kpsf == tk)
        {
            System.out.print(ans+" ");
            count++;
            return;
        }

        if(col == board[0].length)
        {
            row++;
            col = 0;
        }
        if(row == board.length)
        {
            return;
        }

        if(isItSafeToPlaceTheKnight(board, row, col))
        {
            board[row][col] = true;
            N_Knight(board, row, col+1, kpsf+1, tk, ans+"{"+row+ "-"+ col+ "} ");
            board[row][col] = false;
        }
        N_Knight(board, row, col+1, kpsf, tk, ans);
    }

    private static boolean isItSafeToPlaceTheKnight(boolean[][] board, int row, int col)
    {
        if(row-2>=0 && col-1>=0)
        {
            if(board[row-2][col-1])
            {
                return false;
            }
        }
        if(row-2>=0 && col+1<board[0].length)
        {
            if(board[row-2][col+1])
            {
                return false;
            }
        }
        if(row-1>=0 && col-2>=0)
        {
            if(board[row-1][col-2])
            {
                return false;
            }
        }
        if(row-1>=0 && col+2<board[0].length)
        {
            if(board[row-1][col+2])
            {
                return false;
            }
        }

        return true;
    }
}
