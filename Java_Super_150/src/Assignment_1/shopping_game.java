package Assignment_1;

import java.util.Scanner;

public class shopping_game
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j=1; j<=n; j++)
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int i=1;
            int aayush=0;
            int harshit=0;
            while(true)
            {
                if(i%2!=0)
                {
                    aayush+=i;
                    if(aayush>n1)
                    {
                        System.out.println("Harshit");
                        break;
                    }
                }
                else
                {
                    harshit+=i;
                    if(harshit>n2)
                    {
                        System.out.println("Aayush");
                        break;
                    }
                }
                i++;
            }
        }
    }
}
