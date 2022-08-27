import java.util.*;
class nearestprime
{	
	public static boolean prime(int x)
	{
	    if (x==1)
	    {
	        return false;
	    }
		for(int j=2;j<=(int)Math.sqrt(x);j++)
		{
			if (x%j==0)
			{
				return false;
			}
		}
		return true;
	}
	public static int afterprime(int x)
	{
	      int i=x;
		while (true)
		{
			if (prime(i))
			{
				break;
			}
			i+=1;
		}
		return i;
	}
	public static int beforeprime(int x)
	{
	      int i=x;
		while (i>1)
		{	
			if (prime(i))
			{
				
				break;
			}
			i-=1;
		}
		return i;
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m,n,b,a,d1,d2;
		m=sc.nextInt();
		for(int i=1;i<=m;i++)
		{
		    n=sc.nextInt();
    		a=afterprime(n);
    		b=beforeprime(n);
    		d1=b-n;
    		d2=n-a;
    		if (d1>d2)
    		{
    			System.out.println(b);
    		}
    		else if (d1<d2)
    		{
    			System.out.println(a);
    		}
    		else
    		{
    			System.out.println(b);
    		}
		}
	}
}
