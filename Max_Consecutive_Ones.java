import java.util.*;
class consecutive
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,h=0,c=0;
        n=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            int a;
            a=sc.nextInt();
            if (a==1)
            {
                c+=1;
            }
            else
            {
                if (c>h)
                {
                    h=c;
                    c=0;
                }
            }
        }
        if (c>h)
                {
                    h=c;
                    c=0;
                }
        System.out.println(h);
    }
}