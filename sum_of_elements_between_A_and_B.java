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
        int h=0,s=0;
        for(int j=0;j<n;j++)
        {
            if (x[j]>=a && x[j]<=b)
            {
                h=1;
                s+=x[j];
            }
        }
        System.out.println(s);
    }
}