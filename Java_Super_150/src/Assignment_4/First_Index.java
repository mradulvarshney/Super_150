package Assignment_4;
import java.util.*;

public class First_Index
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int search = sc.nextInt();
        System.out.println(search(arr, search, 0));
    }

    public static int search(int[] arr, int search, int index)
    {
        if (index == arr.length)
            return -1;
        if(arr[index] == search)
            return index;
        return search(arr, search, index+1);
    }
}

