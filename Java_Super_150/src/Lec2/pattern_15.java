package Lec2;

import java.util.Scanner;

public class pattern_15
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star=n;
        int row=1;
        int space=0;
        while(row<=(2*n)-1)
        {
            int i=1;
            while(i<=space)
            {
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=star)
            {
                System.out.print("* ");
                j++;
            }
            row++;
            if(row<=n)
            {
                star--;
                space+=2;
            }
            else
            {
                star++;
                space-=2;
            }
            System.out.println();

        }
    }
}

