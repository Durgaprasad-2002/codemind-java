import java.util.*;
class self 
{
    public static boolean self(int n)
	{
		int h,d,l;
		int i=0,c=0;
		l=(int)Math.log10(n)+1;
		h=n;
		while (n>0)
		{
			d=n%10;
			n=n/10;
			if (d==0)
			    continue;
			if(h%d==0)
				c+=1;
			i++;
		}
		if (l==c)
			return true;
		else
			return false;
	}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,r;
        l=sc.nextInt();
        r=sc.nextInt();
        for(int i=l;i<=r;i++)
        {
            if (self(i))
                System.out.print(i+" ");
        }
    }
}