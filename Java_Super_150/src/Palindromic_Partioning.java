import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindromic_Partioning
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        partioning("nitin", list, ans);
        System.out.println(ans);
    }
    public static void partioning(String ques, List<String> list, List<List<String>> ans)
    {
        if (ques.length()==0)
        {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i=1; i<=ques.length(); i++)
        {
            String s = ques.substring(0,i);
            if (isPalindrome(s))
            {
                list.add(s);
                partioning(ques.substring(i), list,ans);
                list.remove(list.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if (s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
