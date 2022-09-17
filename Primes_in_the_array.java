import java.util.*;
class siva 
{
    public static boolean isprime(int n)
    {
        for(int j=2;j<=(int)Math.sqrt(n);j++)
        {
            if (n%j==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a; 
            a=sc.nextInt();
            if (a==1)
                continue;
            if (isprime(a))
                c+=1;
        }
        System.out.println(c);
    }
}