package Assignment_1;

import java.util.Scanner;

public class chewbacca_and_number
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        String str = String .valueOf(n);
        long len = str.length();
        long c = 1;
        long mul = 1;
        long sum=0;
        while(n!=0)
        {
            long rem = n%10;
            if(9-rem<rem)
            {
                if(9-rem==0 && c==len)
                {
                    rem=rem;
                }
                else
                {
                    rem=9-rem;
                }
            }
            sum = sum + rem*mul;
            n/=10;
            mul*=10;
            c++;
        }
        System.out.println(sum);
    }
}
