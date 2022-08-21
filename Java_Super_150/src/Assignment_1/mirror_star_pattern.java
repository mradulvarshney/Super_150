package Assignment_1;

import java.util.Scanner;

public class mirror_star_pattern
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            if(i<n/2 + 1){
                for (int j = n - i -2; j > 0; j--) {
                    System.out.print("  ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                for(int j=0;j<i;j++){
                    System.out.print("* ");
                }
            }
            else{
                System.out.println(i);
                for (int j = i; j > 1; j--) {
                    System.out.print("  ");
                }

                for (int j = 0; j < n-i; j++) {
                    System.out.print("* ");
                }
                for(int j=0;j<n-i-1;j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
