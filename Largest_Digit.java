import java.util.*;
class maxdigit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,d,m=0;
		int i=1;
		n=sc.nextInt();
		while (n>0)
		{
			d=n%10;
			n=n/10;
			if (d>m)
			{
				m=d;
			}
		}
		System.out.println(m);
	}
}