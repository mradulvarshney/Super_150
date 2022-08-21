package Assignment_1;

import java.util.Scanner;

public class pattern_magic
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row=1;
        int space=-1;
        int star = n;
        while(row<=(2*n)-1)
        {
            int i = 1;
            while(i<=star)
            {
                System.out.print("*");
                i++;
            }
            int j=1;
            while(j<=space)
            {
                System.out.print(" ");
                j++;
            }
            if(row==1 || row==(2*n)-1)
                i=2;
            else
                i=1;
            while(i<=star)
            {
                System.out.print("*");
                i++;
            }
            row++;
            if(row<=n)
            {
                space+=2;
                star--;
            }
            else
            {
                space-=2;
                star++;
            }
            System.out.println();
        }
    }
}
