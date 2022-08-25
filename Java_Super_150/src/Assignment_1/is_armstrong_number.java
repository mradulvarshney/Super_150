package Assignment_1;

import java.util.Scanner;

public class is_armstrong_number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int len = String.valueOf(n).length();
        int sum=0;
        while(n>0)
        {
            int rem = n%10;
            sum+=(int)Math.pow(rem,len);
            n/=10;
        }
        //System.out.println(sum);
        if(temp==sum)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
