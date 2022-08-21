package Assignment_1;

import java.util.Scanner;

public class hollow_rhombus_pattern
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int row=1;
        int star = n;
        int space = n-1;
        int inner_space = n-2;
        int i = 1;
        while(i<=space)
        {
            System.out.print(" ");
            i++;
        }
        int j=1;
        while(j<=star)
        {
            System.out.print("*");
            j++;
        }
        System.out.println();
        space--;
        row++;
        while(row<n)
        {
            i = 1;
            while(i<=space)
            {
                System.out.print(" ");
                i++;
            }
            System.out.print("*");
            j=1;
            while(j<=inner_space)
            {
                System.out.print(" ");
                j++;
            }
            System.out.print("*");
            space--;
            row++;
            System.out.println();
        }
        j=1;
        while(j<=star)
        {
            System.out.print("*");
            j++;
        }
    }
}
