package Assignment_1;

import java.util.Scanner;

public class check_prime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t=1;
        for(int i=2;i<n;i++)
        {
            if(n%2==0)
            {
                t++;
                break;
            }
        }
        if(t==1)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
    }
}
