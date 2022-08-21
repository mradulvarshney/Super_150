package Assignment_1;

import java.util.Scanner;

public class sum_of_odd_placed_and_even_placed_digits
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int odd=0, even=0, i=1;
        while(num!=0)
        {
            int rem = num%10;
            if(i%2!=0)
            {
                even+=rem;
            }
            else
            {
                odd+=rem;
            }
            num/=10;
            i++;
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
