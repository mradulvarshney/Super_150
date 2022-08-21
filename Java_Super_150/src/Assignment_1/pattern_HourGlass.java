package Assignment_1;

import java.util.Scanner;

public class pattern_HourGlass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int digit = n;
        int space = 1;
        while(row<=(2*n)+1)
        {
            int i=1;
            while(i<space)
            {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            int k = digit;
            while(j<=(2*digit)+1)
            {
                if(j==(((2*digit)+1)/2)+2)
                {
                    k+=2;
                }
                if(j<=(((2*digit)+1)/2)+1)
                {
                    System.out.print(k+" ");
                    k--;
                }
                else
                {
                    System.out.print(k+" ");
                    k++;
                }
                j++;
            }
            row++;
            if(row<=(((2*n)+1)/2)+1)
            {
                digit--;
                space++;
            }
            else
            {
                digit++;
                space--;
            }
            System.out.println();
        }
    }
}
