import java.util.*;
class palindromenumber
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
        int n,num;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int revnum=0;
            num=sc.nextInt();
            revnum=rev(num);
            if (num==revnum)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
            
        }
        
    }
}