package Assignment_4;
import java.util.*;

public class Recurion_Keypad_Codes
{
    static int count = 0;
    public static void main(String args[])
    {
        count = 0;
        String[] keys=new String[]{"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        find(keys,str,"",0);
        System.out.println("\n"+count);
    }
    private static void find(String[] keys,String str,String ans,int idx)
    {
        if(idx==str.length())
        {
            System.out.print(ans+" ");
            count++;
            return;
        }
        String s=keys[str.charAt(idx)-'0'];
        for(int i=0;i<s.length();i++)
        {
            find(keys,str,ans+s.charAt(i),idx+1);
        }
    }
}
