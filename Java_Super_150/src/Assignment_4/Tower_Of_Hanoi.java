package Assignment_4;
import java.util.*;

public class Tower_Of_Hanoi
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String src = "A";
        String hlp = "C";
        String des = "B";
        int n = sc.nextInt();
        toh(n ,src, hlp, des);
    }
    public static void toh(int n , String src , String hlp , String des)
    {
        if(n == 0)
        {
            return;
        }
        toh(n-1 ,src , des , hlp);
        System.out.println("Moving ring "+n+" from "+src + " to "+des);
        toh(n-1 , hlp , src , des);
    }
}
