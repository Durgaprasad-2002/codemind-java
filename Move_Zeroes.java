import java.util.*;
class move
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,f=0;
        n=sc.nextInt();
        int l=n-1;
        int x[]=new int[n];
        for (int i=0;i<n;i++)
        {
            int a;
            a=sc.nextInt();
            if (a!=0)
            {
                x[f]=a;
                f+=1;
            }
            else{
                x[l]=a;
                l-=1;
            }
        }
        for (int j=0;j<n;j++)
        {
            System.out.print(x[j]+" ");
        }
    }
}