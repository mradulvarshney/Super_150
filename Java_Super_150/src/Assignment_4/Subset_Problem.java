package Assignment_4;

import java.util.*;

public class Subset_Problem
{
    static int count = 0;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        subset(arr, 0, target, "", 0);
        System.out.println("\n"+ count);
    }
    public static void subset(int[] arr, int index, int target, String ans, int res)
    {
        if(res == target)
        {
            System.out.print(ans+ " ");
            count++;
            return;
        }
        if(res>target)
        {
            return;
        }
        for(int i=index; i<arr.length; i++)
        {
            subset(arr, i+1, target, ans+arr[i]+" ", res+arr[i]);
        }
    }
}

