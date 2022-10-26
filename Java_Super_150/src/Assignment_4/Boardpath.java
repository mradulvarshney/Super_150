package Assignment_4;
import java.util.*;

public class Boardpath
{
    static int count = 0;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int face = sc.nextInt();
        boardPath(0, n, face, "");
        System.out.println("\n"+ count);
    }

    public static void boardPath(int curr, int n, int face, String ans)
    {
        if(curr == n)
        {
            System.out.print(ans+" ");
            count++;
            return;
        }
        if(curr>n)
        {
            return;
        }
        for(int i=1; i<=face; i++)
        {
            boardPath(curr+i, n, face, ans+i);
        }
    }
}

