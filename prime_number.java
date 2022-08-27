import java.util.*;
class primesinrange
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
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a;
		a=sc.nextInt();
		if (prime(a))
		{
			System.out.print("prime");
		}
		else
		{
			System.out.print("not a prime");
		}
		
		
	}
}
