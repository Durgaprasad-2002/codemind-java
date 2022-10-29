import java.util.*;
class camel
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        String s,c="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        s=sc.nextLine();
        int co=1;
        for(int i=1;i<s.length();i++)
        {
            for(int j=0;j<c.length();j++)
            {
                if (s.charAt(i)==c.charAt(j))
                {
                    co+=1;
                }
            }
        }
        System.out.println(co);
    }
}