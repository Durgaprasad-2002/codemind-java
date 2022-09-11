import java.util.*;
class perfectcube
{
    public static boolean pretty1(int i)
    {
        int d=0;
        d=i%10;
        if (d==2||d==3||d==9)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static int pretty(int l,int r)
    {
       int k=0;
       for(int i=l;i<=r;i++)
       {
           if (pretty1(i))
           {
               k+=1;
           }
       }
       return k;
    }
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,l,r,c;
		n=sc.nextInt();
		for(int i=1;i<=n;i+=1)
		{
		    l=sc.nextInt();
		    r=sc.nextInt();
		    c=pretty(l,r);
		    System.out.println(c);
		}
	}
}
