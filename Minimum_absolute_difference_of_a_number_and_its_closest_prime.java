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
		int n,b,a,d1,d2;
		n=sc.nextInt();
    	a=afterprime(n);
    	b=beforeprime(n);
    	d1=n-b;
    	d2=a-n;
    	if (d1>d2)
    	{
    		System.out.println(d2);
    	}
    	else
    	{
    		System.out.println(d1);
    	}
	}
}