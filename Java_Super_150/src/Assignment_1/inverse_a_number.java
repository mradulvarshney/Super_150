package Assignment_1;

import java.util.Scanner;

public class inverse_a_number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int pos=1;
        while(n!=0)
        {
            int rem = n%10;
            sum=sum+(pos*(int)Math.pow(10,rem-1));
            n/=10;
            pos++;
        }
        System.out.println(sum);
    }
}
