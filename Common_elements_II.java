import java.util.*;
class unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        n1=sc.nextInt();
        n2=sc.nextInt();
        int x[]=new int[n1];
        int y[]=new int[n2];
        for(int i=0;i<n1;i++)
        {
            int a;
            a=sc.nextInt();
            x[i]=a;
        }
        for(int j=0;j<n2;j++)
        {
            int a;
            a=sc.nextInt();
            y[j]=a;
        }
        for(int i=0;i<n1;i++)
        {
            int h=0;
            for(int j=0;j<n2;j++)
            {
                if (x[i]==y[j])
                {
                    h=1;
                }
            }
            if (h==0)
            {
                System.out.printf(x[i]+" ");
            }
        }
        for(int i=0;i<n2;i++)
        {
            int h=0;
            for(int j=0;j<n1;j++)
            {
                if (y[i]==x[j])
                {
                    h=1;
                }
            }
            if (h==0)
            {
                System.out.printf(y[i]+" ");
            }
        }
    }
}