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
        int n,sq,n1,sq1,sq1r;
        n=sc.nextInt();
        sq=n*n;
        n1=rev(n);
        sq1=n1*n1;
        sq1r=rev(sq1);
        if (sq==sq1r)
            System.out.println("True");
        else
            System.out.println("False");
    }
}