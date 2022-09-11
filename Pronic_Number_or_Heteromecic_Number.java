import java.util.*;
class automorphic
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,h=0;
		n=sc.nextInt();
		for (int i=1;(i*(i+1)<=n);i++)
		{
		    if (i*(i+1)==n)
		    {
		        h=1;
		        System.out.println("YES");
		        break;
		    }
		}
		if (h==0)
		    System.out.println("NO");
	}
}
