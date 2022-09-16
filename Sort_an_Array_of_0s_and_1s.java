import java.util.*;
class sort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,m,n;
        l=sc.nextInt();
        m=0;
        n=l-1;
        int x[]=new int[l];
        int y[]=new int[l];
        int i,j,z;
        for(i=0;i<l;i++)
        {
            x[i]=sc.nextInt();
        }
        for(j=0;j<l;j++)
        {
            if (x[j]==0)
            {
               y[m]=0;
               m++;
            }
            else
            {
                y[n]=1;
                n--;
            }
        }
        for(z=0;z<l;z++)
        {
            System.out.print(y[z]+" ");
        }
    }
}