package Assignment_1;

import java.util.Scanner;

public class print_series
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int c=0;
        int i=1;
        while(c!=n1)
        {
            if(((3*i)+2)%n2!=0)
            {
                System.out.println(((3*i)+2));
                c++;
            }
            i++;
        }
    }
}
