package Assignment_1;

import java.util.Scanner;

public class count_digits
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int count = 0;
        while(n!=0)
        {
            int rem = n%10;
            if(r==rem)
            {
                count++;
            }
            n/=10;
        }
        System.out.println(count);
    }
}
