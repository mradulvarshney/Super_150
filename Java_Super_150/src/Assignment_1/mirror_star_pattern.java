package Assignment_1;

import java.util.Scanner;

public class mirror_star_pattern
{
    public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n/2;
		int star=1;
		while(row<=n)
		{
			int i=1;
			while(i<=space)
			{
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while(j<=star)
			{
				System.out.print("* ");
				j++;
			}
			row++;
			if(row<=(n/2)+1)
			{
				star+=2;
				space--;
			}
			else
			{
				star-=2;
				space++;
			}
			System.out.println();
		}
    }
}
