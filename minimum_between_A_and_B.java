import java.util.*;
class notin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,b;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int c;
            c=sc.nextInt();
            x[i]=c;
        }
        a=sc.nextInt();
        b=sc.nextInt();
        int h=0,s=0,mx=10000;
        for(int j=0;j<n;j++)
        {
            if (x[j]>=a && x[j]<=b)
            {
                if (x[j]<mx)
                    mx=x[j];
                h=1;
            }
        }
        if (h==0)
            System.out.println(-1);
        else
            System.out.println(mx);
    }
}