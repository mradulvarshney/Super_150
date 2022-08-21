package Assignment_1;

import java.util.Scanner;

public class nth_fibonacci
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a=0, b=1, temp=0;
        int n=sc.nextInt();
        if(n==0)
            System.out.println("0");
        else if (n==1)
            System.out.println("1");
        else
        {
            for (int i = 2; i <= n; i++) {
                temp = a + b;
                a = b;
                b = temp;
            }
            System.out.println(temp);
        }
    }
}
