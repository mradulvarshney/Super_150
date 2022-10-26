package Assignment_4;
import java.util.*;

public class Recursion_Subsequences
{
    static int outcome = 0;
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        subSequence(str, "", 0);
        System.out.println("\n"+outcome);
    }
    public static void subSequence(String str, String res, int index)
    {
        if(index>=str.length())
        {
            System.out.print(res+" ");
            outcome++;
            return;
        }
        char c = str.charAt(index);
        subSequence(str, res, index+1);
        subSequence(str, res+c, index+1);
    }
}

