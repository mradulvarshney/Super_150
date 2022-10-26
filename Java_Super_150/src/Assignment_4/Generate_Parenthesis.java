package Assignment_4;
import java.util.*;

public class Generate_Parenthesis
{
    static ArrayList<String> arr = new ArrayList<>();
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        generate(n, "", 0, 0);
        for(int i=arr.size()-1; i>=0; i--)
        {
            System.out.println(arr.get(i));
        }
    }
    public static void generate(int n, String str, int open, int close)
    {
        if(str.length() == n*2)
        {
            arr.add(str);
            return;
        }
        if(open < n)
        {
            generate(n, str+"(", open+1, close);
        }
        if(close<open)
        {
            generate(n, str+")", open, close+1);
        }
    }
}
