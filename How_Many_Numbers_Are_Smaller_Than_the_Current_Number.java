import java.util.*;
class smaller
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for (int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            int c=0;
            for (int j=0;j<n;j++)
            {
                if (x[j]<x[i])
                {
                    c+=1;
                }
            }
            System.out.print(c+" ");
        }
    }
}