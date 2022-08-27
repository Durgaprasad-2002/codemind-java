import java.util.*;
class digit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,d,s=0,m=1;
		int i=1;
		n=sc.nextInt();
		while (n>0)
		{
			d=n%10;
			n=n/10;
			s=s+d;
			m=m*d;
		}
		System.out.println(Math.abs(m-s));
	}
}