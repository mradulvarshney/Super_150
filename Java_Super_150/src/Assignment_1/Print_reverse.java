package Assignment_1;

import java.util.Scanner;

public class Print_reverse
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long sum=0;
        while(n!=0)
        {
            long rem = n%10;
            sum=sum*10+rem;
            n/=10;
        }
        System.out.println(sum);
    }
}
