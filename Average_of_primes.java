import java.util.*;
class notin
{
    public static boolean isprime(int n)
    {
        if (n==1)
            return false;
        for(int j=2;j<=(int)Math.sqrt(n);j++)
        {
            if (n%j==0)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,count=0,s=0;
        n=sc.nextInt();
        double r;
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int c;
            c=sc.nextInt();
            if (isprime(c))
            {
                count+=1;
                s+=c;
            }
            x[i]=c;
        }
        r=(double)s/count;
        System.out.printf("%.2f",r);
    }
}