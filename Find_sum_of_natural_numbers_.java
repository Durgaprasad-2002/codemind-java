import java.util.*;
class perfectcube
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,s=0;
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		    s+=i;
		}
		System.out.println(s);
	}
}
