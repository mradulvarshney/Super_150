package Assignment_4;
import java.util.*;

public class Nth_Triangle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(find(1, n));
    }
    public static int find(int num, int n)
    {
        if(num == n)
        {
            return num;
        }
        return num+find(num+1, n);
    }
}

