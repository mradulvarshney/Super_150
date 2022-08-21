package Assignment_1;

import java.util.Scanner;

public class pattern_mountain {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int digit=1;
        int space = (n*2)-3;
        while(row<=n)
        {
            int i = 1;
            while(i<=digit)
            {
                System.out.print(i+" ");
                i++;
            }
            int j = 1;
            while(j<=space)
            {
                System.out.print("  ");
                j++;
            }
            if(space<=0)
                i-=2;
            else
                i--;
            while(i>=1)
            {
                System.out.print(i+" ");
                i--;
            }
            row++;
            digit++;
            space-=2;
            System.out.println();
        }
    }
}
