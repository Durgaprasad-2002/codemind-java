import java.util.*;
class exceptnum
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
        int y[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int s=1;
            for (int j=0;j<n;j++)
            {
                if (i!=j)
                {
                    s*=x[j];
                }
            }
            y[i]=s;
            System.out.print(y[i]+" ");
        }
        
    }
}