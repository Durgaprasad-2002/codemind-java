import java.util.*;
class hh
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k;
        int c=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int a;
            a=sc.nextInt();
            x[i]=a;
        }
        k=sc.nextInt();
        for(int j=0;j<n;j++)
        {
            if (x[j]==k)
                c+=1;
        }
        System.out.println(c);
    }
}