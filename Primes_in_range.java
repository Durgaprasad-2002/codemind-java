import java.util.*;
class primesinrange
{	
	public static boolean prime(int x)
	{
	    int r=0;
	    if (x==1)
	    {
	        return false;
	    }
		for(int j=2;j<=(int)Math.sqrt(x);j++)
		{
			if (x%j==0)
			{
				r+=1;
			}
		}
		if (r==0)
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
		int a,b,c=0;
		a=sc.nextInt();
		b=sc.nextInt();
		if (a==1)
		{
			a+=1;
		}
		for(int i=a;i<=b;i+=1)
		{
			if (prime(i))
			{
				c+=1;
			}
		}
		System.out.println(c);
		
	}
}
