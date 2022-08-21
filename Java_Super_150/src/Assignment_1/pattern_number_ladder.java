package Assignment_1;

import java.util.Scanner;

public class pattern_number_ladder
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row=1;
        int digit=1;
        int j = 1;
        while(row<=n)
        {
            int i = 1;
            while(i<=digit)
            {
                System.out.print(j +" ");
                i++;
                j++;
            }
            row++;
            digit++;
            System.out.println();
        }
    }
}
