import java.util.*;
class airport
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        int x[]=new int[n];
        for (int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        k=sc.nextInt();
        int c=0;
        for (int i=0;i<n;i++)
        {
            if (x[i]<=k)
                c+=1;
            else
                c+=2;
        }
        System.out.println(c);
    }
}