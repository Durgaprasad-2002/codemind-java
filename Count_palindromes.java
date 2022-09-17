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
        int n,num,c=0;
        n=sc.nextInt();
        int x[]= new int[n];
        for(int i=0;i<n;i++)
        {
            int a;
            a=sc.nextInt();
            x[i]=a;
        }
        for(int j=0;j<n;j++)
        {
            int s;
            s=x[j];
            num=rev(s);
            if (s==num)
                c+=1;
        }
        System.out.println(c);
        
    }
}