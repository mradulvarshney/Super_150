public class binary_search
{
    public static void main(String[] args)
    {
        int[] arr = {2,3,5,7,9,11,13,14,15,16,18};
        System.out.println(search(arr, 18));
    }

    public static int search(int[] arr, int n)
    {
        int si = 0;
        int ei = arr.length-1;

        while(si<=ei)
        {
            int mid = (si+ei)/2;

            if(n==arr[mid])
            {
                return mid;
            }

            else if(n>arr[mid])
            {
                si = mid+1;
            }
            else
            {
                ei = mid-1;
            }
        }
        return -1;
    }
}
