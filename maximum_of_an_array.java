import java.util.*;
class hh
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int h=0;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a;
            a=sc.nextInt();
            if(a>h)
            {
                h=a;
            }
        }
        if(h!=0)
            System.out.println(h);
        else
            System.out.println(-1);
    }
}