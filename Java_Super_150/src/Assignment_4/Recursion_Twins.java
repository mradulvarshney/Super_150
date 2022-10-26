package Assignment_4;
import java.util.*;

public class Recursion_Twins
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String s = sc.next();
        char ch = s.charAt(0);
        for(int i=2; i<s.length(); i+=2)
        {
            if(ch == s.charAt(i))
            {
                count++;
            }
            else
            {
                ch = s.charAt(i);
            }
        }
        ch = s.charAt(1);
        for(int i=3; i<s.length(); i+=2)
        {
            if(ch == s.charAt(i))
            {
                count++;
            }
            else
            {
                ch = s.charAt(i);
            }
        }

        System.out.println(count);
    }
}

