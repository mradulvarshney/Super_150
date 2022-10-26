package Assignment_4;
import java.util.*;

public class Split_Array
{
    static int cnt=0;
    public static void main(String args[])
    {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        long sum = 0;
        for(int i = 0; i < n ;i++)
        {
            a[i] = sc.nextLong();
            sum += a[i];
        }
        if(sum%2 == 1)
        {
            System.out.println("0");
            return;
        }
        ArrayList<Long> l1=new ArrayList<>();
        ArrayList<Long> l2=new ArrayList<>();
        split(a , 0 ,l1,l2 ,sum/2 );
        System.out.println(cnt);

    }
    public static void split(long arr[] ,  int i , ArrayList<Long>l1,ArrayList<Long>l2, Long sum){
        if(i == arr.length)
        {
            long sum1 = 0;
            for(int j = 0 ; j < l1.size() ; j++)
            {
                sum1 += l1.get(j);
            }
            if(sum1 == sum)
            {
                for(int j = 0 ;j < l1.size() ; j++)
                {
                    System.out.print(l1.get(j)+" ");
                }
                System.out.print("and ");
                for(int j = 0 ; j < l2.size() ; j++)
                {
                    System.out.print(l2.get(j)+" ");
                }
                System.out.println();
                cnt++;
            }
            return;
        }
        l1.add(arr[i]);
        split(arr , i+1 , l1,l2 ,sum);
        l1.remove(l1.size()-1);
        l2.add(arr[i]);
        split(arr ,i+1, l1,l2 ,sum);
        l2.remove(l2.size()-1);
    }
}
