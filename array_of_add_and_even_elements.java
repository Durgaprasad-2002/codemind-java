import java.util.*;
class hh
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0;
        n=sc.nextInt();
        int o;
        int e=0;
        ///System.out.print(o+" "+e+" ");
        int x[]=new int[n];
        int y[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int a;
            a=sc.nextInt();
            x[i]=a;
            if (a%2!=0)
                c+=1;
        }
        o=c;
        for(int j=0;j<n;j++)
        {
            int a=x[j];
            if (a%2!=0)
            {
                y[e]=a;
                e++;
                
            }
            else
            {
               y[o]=a;
               o+=1;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(y[i]+" ");
        }
    }
}