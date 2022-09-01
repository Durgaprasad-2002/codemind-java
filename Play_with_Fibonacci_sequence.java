import java.util.*;
class pellseries
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int a=0,b=1,c;
		System.out.print(a+" "+b+" ");
		for(int i=1;i<=(n-2);i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}
