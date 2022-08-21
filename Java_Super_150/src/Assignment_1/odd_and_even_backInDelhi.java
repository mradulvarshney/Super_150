package Assignment_1;

import java.util.Scanner;

public class odd_and_even_backInDelhi
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            int num = sc.nextInt();
            int odd=0, even=0;
            while(num!=0)
            {
                int rem = num%10;
                if(rem%2==0)
                {
                    even+=rem;
                }
                else
                {
                    odd+=rem;
                }
                num/=10;
            }
            if(even%4==0 || odd%3==0)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }

    }
}
