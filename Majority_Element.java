import java.util.*;
class majority
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int x[]=new int[n];
        for (int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int m=0,c1=0;
        for (int i=0;i<n;i++)
        {
            if (x[i]!=-999)
            {
                int c=1;
                for(int j=0;j<n;j++)
                {
                   if (x[i]==x[j] && i!=j)
                   {
                       c+=1;
                       x[j]=-999;
                   }
                }
                if (c>=c1)
                {
                    c1=c;
                    m=x[i];
                }
                
            }
            
        }
        System.out.println(m);
    }
}