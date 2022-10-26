package Assignment_4;
import java.util.*;

public class Replace_0_with_5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = String.valueOf(n);
        System.out.println(replacePI(str, 0, ""));
    }

    public static String replacePI(String str, int index, String ans)
    {
        if(index == str.length())
        {
            return ans;
        }
        if(str.charAt(index)=='0')
        {
            ans += 5;
        }
        else
        {
            ans += str.charAt(index);
        }
        return replacePI(str, index+1, ans);
    }
}