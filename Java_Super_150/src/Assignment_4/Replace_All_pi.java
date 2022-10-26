package Assignment_4;
import java.util.*;

public class Replace_All_pi
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++)
        {
            String str = sc.next();
            str += " ";
            System.out.println(replacePI(str, 0, ""));
        }
    }

    public static String replacePI(String str, int index, String ans)
    {
        if(index == str.length()-1)
        {
            return ans;
        }
        if(str.charAt(index)=='p' && str.charAt(index+1)=='i')
        {
            ans += 3.14;
            return replacePI(str, index+2, ans);
        }

        ans += str.charAt(index);
        return replacePI(str, index+1, ans);
    }
}