package Lec2;

import java.util.Scanner;

public class pattern_13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star=1;
        int row=1;
        while(row<=(2*n)-1)
        {
            int i=1;
            while(i<=star)
            {
                System.out.print("* ");
                i++;
            }
            row++;
            if(row<=n)
                star++;
            else
                star--;
            System.out.println();
        }
    }
}
