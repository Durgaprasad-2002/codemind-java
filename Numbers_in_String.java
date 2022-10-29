import java.util.*;
class sumint
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s,d="0123456789";
        s=sc.nextLine();
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<d.length();j++)
            {
                if (s.charAt(i)==d.charAt(j))
                {
                    int a=d.charAt(j)-'0';
                    sum+=a;
                }
            }
        }
        System.out.println(sum);
    }
}