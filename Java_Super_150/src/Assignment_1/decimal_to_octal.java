package Assignment_1;

import java.util.Scanner;

public class decimal_to_octal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Integer.toOctalString(n));
    }
}
