import java.util.*;
class unique
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
        int k=0;
        for (int i=0;i<n;i++)
        {
            if (x[i]!=-999)
            {
                int c=1;
                for (int j=i+1;j<n;j++)
                {
                    if (x[i]==x[j])
                    {
                        x[j]=-999;
                        c+=1;
                    }
                }
                if (c==1)
                {
                    System.out.print(x[i]+" ");
                    k=1;
                }
            }
        }
        if (k==0)
        {
            System.out.println(-1);
        }
    }
}