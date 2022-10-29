import java.util.*;
class unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for (int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            int c=1;
            if (x[i]!=-999)
            {
                for(int j=0;j<n;j++)
                {
                    if (x[i]==x[j] && i!=j)
                    {
                        x[j]=-999;
                        c+=1;
                    }
                }
                if(c==1)
                {
                    if (x[i]>m)
                    {
                        m=x[i];
                    }
                }
            }
        }
        if (m!=0)
            System.out.println(m);
        else
            System.out.println(-1);
    }
}