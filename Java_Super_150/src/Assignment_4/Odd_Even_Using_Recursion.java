package Assignment_4;
import java.util.*;

public class Odd_Even_Using_Recursion
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2!=0)
        {
            print_odd(n);
            print_even(2, n);
        }
        else
        {
            print_odd(n-1);
            print_even(2,n);
        }
    }
    public static void print_odd(int odd)
    {
        if (odd<0)
            return;
        System.out.println(odd);
        print_odd(odd-2);
    }
    public static void print_even(int even, int n)
    {
        if(even>n)
            return;
        System.out.println(even);
        print_even(even+2, n);
    }
}

