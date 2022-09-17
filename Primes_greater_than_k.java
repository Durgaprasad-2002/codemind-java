import java.util.*;
class prime
{
    public static boolean isprime(int n)
    {
        for(int z=2;z<=(int)Math.sqrt(n);z++)
        {
            if (n%z==0)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n,k,s,c=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int a;
            a=sc.nextInt();
            x[i]=a;
        }
        k=sc.nextInt();
        for(int j=0;j<n;j++)
        {
            s=x[j];
            if (isprime(s))
            {
                if (s>=k)
                    c+=1;
            }
        }
        System.out.println(c);
    }
}