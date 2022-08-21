package Assignment_1;

import java.util.Scanner;

public class Pattern_Triangle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int digit = 1;
        int space = n-1;
        int number = 1;
        while(row<=n)
        {
            int i = 1;
            while (i <= space)
            {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            int k = number;
            while (j <= digit)
            {
                if(j<=(digit/2))
                {
                    System.out.print(k+" ");
                    k++;
                }
                else
                {
                    System.out.print(k +" ");
                    k--;
                }
                j++;
            }
            number++;
            row++;
            digit += 2;
            space--;
            System.out.println();
        }
    }
}
