import java.util.*;
class almostprime
{
    public static boolean prime(int n)
    {
        if (n==1)
        {
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if (n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a,h=0;
            a=sc.nextInt();
		 for(int j=2;j<=(int)(a/2);j++)	
            {
                int s1;
                s1=j;
                if (prime(s1))
                {
			   for(int z=2;z<=(int)(a/2);z++)	
                    {
                        int s2;
                        s2=z;
                        if (prime(s2))
                        {
					if (s1!=s2)
					{
                            if (s1*s2==a)
                            {
                                h=1;
                                System.out.println("YES");
                                break;
                            }
					}
                        }
                    }
                }
                if (h==1)
                {
                    break;
                }
               
            }
            if (h==0)
            {
                System.out.println("NO");
            }
            
        }
        
    }
}