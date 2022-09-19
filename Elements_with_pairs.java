import java.util.*;
class pairs
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,h=0;
        n=sc.nextInt();
        if (n%2!=0)
        {
            h=1;
            n+=1;
        }
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if (h==1 && i==n-1)
            {
                x[i]=0;
                break;
            }
            int a;
            a=sc.nextInt();
            x[i]=a;
        }
        for(int j=0;j<n;j++)
        {
            System.out.print(x[j]+" ");
        }
    }
}