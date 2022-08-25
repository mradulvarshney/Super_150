package Assignment_1;

import java.util.Scanner;

public class binary_to_decimal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = Integer.parseInt(str,2);
        System.out.println(n);
    }
}
