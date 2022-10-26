package Assignment_4;
import java.util.*;

public class Convert_String_To_Integer
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(convertToInt(str, 0, 0));
    }
    public static int convertToInt(String str, int index, int ans)
    {
        if(index==str.length())
            return ans;
        ans = ans*10 + (str.charAt(index)-48);
        return convertToInt(str, index+1, ans);

    }
}

