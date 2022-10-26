package Assignment_4;
import java.util.*;

public class All_Indices
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
        search(arr, search, 0);
    }

    public static void search(int[] arr, int search, int index)
    {
        if (index == arr.length)
            return;
        if(arr[index] == search)
        {
            System.out.print(index+ " ");
        }

        search(arr, search, index+1);
    }
}
