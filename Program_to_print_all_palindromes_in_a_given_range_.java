import java.util.*;
class palin
{
    public static int rev(int n)
    {
        int d,s=0,l,p;
        l=(int)Math.log10(n);
        int i=0;
        while (n>0)
        {
            d=n%10;
            n=n/10;
            if (l>0)
            {
                p=(int)Math.pow(10,l);
                d=d*p;
            }
            s+=d;
            l--;
            i++;
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,r,num=0;
        l=sc.nextInt();
        r=sc.nextInt();
        for(int i=l;i<=r;i++)
        {
            num=rev(i);
            if (i==num)
                System.out.print(i+" ");
        }
    }
}