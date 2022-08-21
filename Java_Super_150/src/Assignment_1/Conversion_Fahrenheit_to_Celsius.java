package Assignment_1;

import java.util.Scanner;

public class Conversion_Fahrenheit_to_Celsius
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int step = sc.nextInt();
        for(int i=min; i<=max; i+=step)
        {
            System.out.print(i+" ");
            int c = (5*(i-32)/9);
            System.out.print(c);
            System.out.println();
        }
    }
}
