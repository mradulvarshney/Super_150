package Lec2;

import java.util.Scanner;

public class GCD_HCF
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int divisor = sc.nextInt();
        int divident = sc.nextInt();
        while(divident%divisor!=0)
        {
            int rem = divident%divisor;
            divident=divisor;
            divisor=rem;
        }
        System.out.println(divisor);
    }
}
