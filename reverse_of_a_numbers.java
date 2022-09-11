import java.util.*;
class reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d,s=0,l,p;
        n=sc.nextInt();
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
        System.out.println(s);
        
    }
}