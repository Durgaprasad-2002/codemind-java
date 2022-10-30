import java.util.*;
class replace
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int x[]=new int[n];
        int y[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int h=-1,m=0;
            for(int j=i+1;j<n;j++)
            {
                if (x[j]>m)
                {
                    m=x[j];
                    h=m;
                }
            }
            x[i]=h;
            System.out.print(h+" ");
        }
    }
}