package Assignment_4;
import java.util.*;

public class Recursion_Lexicographical_Order
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        lexico(0,n);
    }
    public static void lexico(int curr, int n)
    {
        if(curr>n)
        {
            return;
        }
        System.out.print(curr+" ");
        int i=0;
        if(curr==0)
        {
            i = 1;
        }
        for(; i<=9; i++)
        {
            lexico(curr*10+i, n);
        }
    }
}