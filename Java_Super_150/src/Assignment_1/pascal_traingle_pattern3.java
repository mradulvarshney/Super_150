package Assignment_1;

import java.util.Scanner;

public class pascal_traingle_pattern3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row=1; row<=n; row++)
        {
            int k = 1;
            for (int i= 1; i<=row; i++)
            {
                System.out.print(k + " ");
                k = k * (row - i) / i;
            }
            System.out.println();
        }
    }
}
