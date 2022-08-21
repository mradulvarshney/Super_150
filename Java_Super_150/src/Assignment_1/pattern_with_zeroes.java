package Assignment_1;

import java.util.Scanner;

public class pattern_with_zeroes
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int row = 1;
        while(row<=n)
        {
            int i = 1;
            while(i<=star)
            {
                if(i==1 || i==star)
                    System.out.print(star+" ");
                else
                    System.out.print("0"+" ");
                i++;
            }
            row++;
            star++;
            System.out.println();
        }
    }
}
