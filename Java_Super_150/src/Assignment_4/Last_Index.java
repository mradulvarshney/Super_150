package Assignment_4;
import java.util.*;

public class Last_Index
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
        System.out.println(search(arr, search, arr.length-1));
    }

    public static int search(int[] arr, int search, int index)
    {
        if (index<0)
            return -1;
        if(arr[index] == search)
            return index;
        return search(arr, search, index-1);
    }
}

