package Assignment_1;

import java.util.Scanner;

public class Hollow_Diamond_Pattern_Pattern_6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space=1;
        int star=n+1;
        int row=2;
        int k=1;
        while(k<star)
        {
            System.out.print("*"+" ");
            k++;
        }
        star-=2;
        System.out.println();
        while(row<n)
        {
            int i=1;
            while(i<=star/2)
            {
                System.out.print("*"+" ");
                i++;
            }
            int j=1;
            while(j<=space)
            {
                System.out.print("  ");
                j++;
            }
            while(i<=star)
            {
                System.out.print("*"+" ");
                i++;
            }
            row++;
            if(row<=(n/2)+1)
            {
                space+=2;
                star-=2;
            }
            else
            {
                space-=2;
                star+=2;
            }
            System.out.println();
        }
        k=1;
        while(k<star)
        {
            System.out.print("*"+" ");
            k++;
        }
    }
}
