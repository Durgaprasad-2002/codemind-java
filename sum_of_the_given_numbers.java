import java.util.*;
class sumofgivennumbers
{
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            int a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=a+b;
            System.out.println(c);
        }
    }
}