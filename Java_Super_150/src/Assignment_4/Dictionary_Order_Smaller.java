package Assignment_4;
import java.util.*;

public class Dictionary_Order_Smaller
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = str.split("");
        Arrays.sort(arr);
        String str2 = "";
        for(int i=0; i<arr.length; i++)
        {
            str2+=arr[i];
        }
        largeDicOrder(str2, "", str);
    }
    public static void largeDicOrder(String ques, String ans, String str)
    {
        if(ques.length() == 0)
        {
            //System.out.println(ans);
            if(compare(ans, str))
            {
                System.out.println(ans);
            }
            return;
        }
        for(int i=0; i<ques.length(); i++)
        {
            char ch = ques.charAt(i);
            String roq = ques.substring(0,i) + ques.substring(i+1);
            largeDicOrder(roq, ans+ch, str);
        }
    }

    public static boolean compare(String ans, String str)
    {
        for(int i=0; i<ans.length(); i++)
        {
            if(ans.equals(str))
            {
                return false;
            }
            if(ans.charAt(i) < str.charAt(i))
            {
                return true;
            }
            else if (ans.charAt(i) > str.charAt(i))
            {
                return false;
            }
        }
        return true;
    }
}

