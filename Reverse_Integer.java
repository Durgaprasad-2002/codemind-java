import java.util.*;
class reverse
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
        int n,h=0,r=0;
        n=sc.nextInt();
        if (n<0)
        {
            n=(n/-1);
            h=1;
        }
        r=rev(n);
        if (h==1)
        {
            r=(r/-1);
        }
        System.out.println(r);
    }
}