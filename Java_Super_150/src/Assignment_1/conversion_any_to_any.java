package Assignment_1;

import java.util.Scanner;

public class conversion_any_to_any
{
    public static int converstion(int num, int sb, int db)
    {
        int ans = 0;
        int mult = 1;
        while(num != 0){
            int rem = num % 10;
            ans  = ans + rem * mult;
            mult = mult * sb;
            num = num / 10;
        }
        mult = 1;
        num = ans;
        ans = 0;
        while(num != 0){
            int rem = num % db;
            ans  = ans + rem * mult;
            mult = mult * 10;
            num = num / db;
        }
        return ans;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b=s.nextInt();
        int n=s.nextInt();
        System.out.println(converstion(n,a,b));
    }
}
