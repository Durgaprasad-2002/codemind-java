import java.util.*;
class automorphic
{
    public static int div(int n)
    {
        int s=1;
        for(int i=2;i<=n/2;i++)
        {
            if (n%i==0)
            {
                s+=i;
            }
        }
        return s;
    }
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n1,n2,d1,d2;
		n1=sc.nextInt();
		n2=sc.nextInt();
		d1=div(n1);
		d2=div(n2);
		if (d1==n2&&n1==d2)
		{
		    System.out.println("Amicable");
		}
		else
		{
		    System.out.println("Not Amicable");
		}
			
	}
}
