package Lec2;

import java.util.Scanner;

public class pattern_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star=5;
        int row=1;
        while(row<=n)
        {
            int i=1;
            while(i<=star)
            {
                System.out.print("* ");
                i++;
            }
            row++;
            star--;
            System.out.println();
        }
    }
}
