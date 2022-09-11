import java.util.*;
class perfectcube
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,n2;
		double n1;
		n=sc.nextInt();
		n1=Math.sqrt(n);
		n2=(int)n1;
		if (n1-n2>0)
		    System.out.println("False");
		else
		    System.out.println("True");
		
	}
}
