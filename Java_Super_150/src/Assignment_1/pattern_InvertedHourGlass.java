package Assignment_1;

import java.util.Scanner;

public class pattern_InvertedHourGlass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int digit = 1;
        int space = (n*2)-1;
        int number = n;
        while(row<=(2*n)+1)
        {
            int i = 1;
            int k = number;
            while(i<=digit)
            {
                System.out.print(k+" ");
                k--;
                i++;
            }
            int j = 1;
            while(j<=space)
            {
                System.out.print("  ");
                j++;
            }
            i=1;
            if(row==((2*n)/2)+1)
            {
                i=2;
                k+=2;
            }
            else
            {
                k++;
            }
            while(i<=digit)
            {
                System.out.print(k+" ");
                k++;
                i++;
            }
            row++;
            if(row<=((2*n)/2)+1)
            {
                digit++;
                space-=2;
            }
            else
            {
                digit--;
                space+=2;
            }
            System.out.println();
        }
    }
}
