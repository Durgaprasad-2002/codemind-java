import java.util.*;
class unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int a;
            a=sc.nextInt();
            x[i]=a;
        }
        int k;
        k=sc.nextInt();
        int h=0;
        for(int i=0;i<n;i++)
        {
            int c1=1;
            if (x[i]!=-9999)
            {
                for(int j=0;j<n;j++)
                {
                    if (x[i]==x[j] && i!=j)
                    {
                        x[j]=-9999;
                        c1+=1;
                    }
                }
                if (k==c1)
                {
                    h=1;
                    System.out.printf(x[i]+" ");
                }
            }

        }
        if (h==0)
        {
            System.out.println(-1);
        }
    }
}