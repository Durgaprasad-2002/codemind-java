import java.util.*;
class min
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m=10000;
        n=sc.nextInt();
        int x[]=new int[n];
        for (int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        System.out.print(-1+" ");
        for (int i=1;i<n;i++)
        {
            int k=0;
            for(int j=i;j>=0;j--)
            {
                if (x[j]<x[i])
                {
                    k=1;
                    System.out.print(x[j]+" ");
                    break;
                }
            }
            if (k==0)
            {
                System.out.print(-1+" ");
            }
        }
    }
}