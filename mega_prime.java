import java.util.*;
class megaprime
{
    public static boolean isprime(int n)
    {
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if (n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean digit(int n)
    {
        int i=0,c=0,l=0,d=0;
        while (n>0)
        {
            d=n%10;
            n=n/10;
            l+=1;
		if (d==1)
			continue;
            if (isprime(d))
            {
                c+=1;
            }
            i++;
        }
        if (c==l)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if (isprime(n))
        {
            if (digit(n))
            {
                System.out.println("Mega Prime");
            }
            else
            {
                System.out.println("Not Mega Prime");
            }
        }
        else
        {
            System.out.println("Not Mega Prime");
        }
        
    }
}