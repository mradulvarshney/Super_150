package Assignment_1;

import java.util.Scanner;

public class Pattern_Double_Sided_Arrow
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space_outer = n-1;
        int space_inner = -1;
        int digit = 1;
        while(row<=n)
        {
            int i=1;
            while(i<=space_outer)
            {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            int z = digit;
            while(j<=digit)
            {
                System.out.print(z+" ");
                z--;
                j++;
            }
            int k = 1;
            while(k<=space_inner)
            {
                System.out.print("  ");
                k++;
            }
            if(row==1 || row==n)
            {
                z+=2;
            }
            else
            {
                z++;
            }
            while(z<=digit)
            {
                System.out.print(z+" ");
                z++;
            }
            row++;
            if(row<=(n/2)+1)
            {
                digit++;
                space_outer-=2;
                space_inner+=2;
            }
            else
            {
                digit--;
                space_outer+=2;
                space_inner-=2;
            }
            System.out.println();
        }
    }
}
