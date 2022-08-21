package Assignment_1;

import java.util.Scanner;

public class print_primes {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2; i<=n; i++)
        {
            int t=1;
            for(int j=2; j<i; j++)
            {
                if(i%j==0)
                {
                    t=2;
                    break;
                }
            }
            if(t==1)
            {
                System.out.println(i);
            }
        }
    }
}
