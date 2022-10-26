package Assignment_4;
import java.util.*;

public class Vivek_Loves_Array_Game
{
    static int count = 0;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=0; i<test; i++)
        {
            count = 0;
            //System.out.println("c"+count);
            int n = sc.nextInt();
            long[] arr = new long[n];
            long sum = 0;
            for(int j=0; j<n; j++)
            {
                arr[j] = sc.nextLong();
                sum+=arr[j];
            }
            if(sum == 0)
            {
                System.out.println(n-1);
            }
            else
            {
                System.out.println(arrayGame(arr, 0, n, sum));
            }
        }
    }

    private static long arrayGame(long[] arr, int l, int r, long sum)
    {
        long l_sum = 0;
        long r_sum = sum;
        for(int i=l; i<r; i++)
        {
            l_sum+=arr[i];
            r_sum-=arr[i];
            if(l_sum == r_sum)
            {
                return 1 + Math.max(arrayGame(arr, l, i+1, l_sum), arrayGame(arr, i+1, r, r_sum));
            }
        }
        return 0;
    }
}
