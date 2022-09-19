import java.util.*;
class pairs
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int a;
            a=sc.nextInt();
            x[i]=a;
        }
        int s,b;
        
        if (n%2!=0)
        {
            s=(int)n/2+1;
            b=n-1;
        }
        else
        {
            s=n/2;
            b=n-1;
        }
        for(int j=0;j<s;j++)
        {
            if (n%2!=0)
            {
                if (j==s-1)
                {
                    System.out.print(x[j]+" "+0+" ");
                    break;
                }
            }
            System.out.print(x[j]+" "+x[b]+" ");
            b--;
        }
        
    }
}