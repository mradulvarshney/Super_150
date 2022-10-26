import java.util.*;

public class staircase
{
    public static void main(String[] args)
    {
        int n = 4;
        List<String> ans = generateParenthesis(n);
        for(int i=0; i< ans.size(); i++)
        {
            System.out.println(ans.get(i));
        }
    }
    public  static List<String> generateParenthesis(int n)
    {
        List<String> list = new ArrayList<>();
        return generate(list, n, "", 0 ,0);
    }

    public static List<String> generate(List list, int n, String str, int open, int close)
    {
        if(str.length() == n*2)
        {
            list.add(str);
            return list;
        }
        if(str.length()>n*2)
        {
            return list;
        }
        if(open<n)
        {
            generate(list, n, str+"(", open+1, close);
        }
        if(close<open)
        {
            generate(list, n, str+")", open, close+1);
        }

        return list;
    }
}
