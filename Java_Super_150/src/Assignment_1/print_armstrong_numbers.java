package Assignment_1;

import java.util.Scanner;

public class print_armstrong_numbers
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        for(int i=num1; i<=num2; i++)
        {
            int num =i;
            int temp=i;
            int len = String.valueOf(i).length();
            int sum=0;
            while(temp>0)
            {
                int rem = temp%10;
                sum+=(int)Math.pow(rem,len);
                temp/=10;
            }
            //System.out.println(sum);
            if(num==sum)
            {
                System.out.println(i);
            }
        }
    }
}
