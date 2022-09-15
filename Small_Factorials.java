import java.util.*;
class factorials
{
    public static int fact(int n)
    {
        int mul=1;
        for(int j=1;j<=n;j++)
        {
            mul*=j;
        }
        return mul;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int a,r;
            a=sc.nextInt();
            r=fact(a);
            System.out.println(r);
        }
    }
}