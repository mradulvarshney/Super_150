package Assignment_4;
import java.util.*;

public class Generate_Binary_Strings
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i=0; i<test; i++)
        {
            String str = sc.next();
            generate(str, 0);
            System.out.println();
        }
    }
    public static void generate(String str, int index)
    {
        if (index == str.length())
        {
            System.out.print(str+ " ");
            return;
        }

        if (str.charAt(index) == '?')
        {
            str = str.substring(0, index)+"0"+str.substring(index+1);
            generate(str, index + 1);

            str = str.substring(0, index)+"1"+str.substring(index+1);
            generate(str, index + 1);
        }
        else
            generate(str, index + 1);
    }
}