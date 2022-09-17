import java.util.*;
class scale
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,h=999;
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
        for (int j=h;j>0;j--)
        {
            int c=0;
            for (int z=0;z<n;z++)
            {
                if(x[z]%j==0)
                    c+=1;
            }
            if (c==n)
            {
                System.out.println(j);
                break;
            }
            else
                continue;
            
        }
    }
}