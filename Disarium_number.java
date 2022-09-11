import java.util.*;
class disarium
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,l,s=0,h,d1,d;
        n=sc.nextInt();
        h=n;
        l=(int)Math.log10(n)+1;
        int i=0;
        while (n>0)
        {
            d=n%10;
            n=n/10;
            d1=(int)Math.pow(d,l);
            l--;
            s+=d1;
            i++;
        }
        if (s==h)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}