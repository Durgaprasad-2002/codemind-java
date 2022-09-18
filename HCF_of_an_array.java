import java.util.*;
class hcf
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,h=100000;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int a;
            a=sc.nextInt();
            x[i]=a;
            if (a<h)
                h=a;
        }
        for(int j=h;j>0;j--)
        {
            int s=j,c=0;
            for(int z=0;z<n;z++)
            {
                if(x[z]%s==0)
                {
                    c+=1;
                }
            }
            if (c==n)
            {
                System.out.println(s);
                break;
            }
        }
    }
}