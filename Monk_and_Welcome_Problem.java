import java.util.*;
class sub{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        for (int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            int s=sc.nextInt();
            System.out.print((s+x[i])+" ");
        }
    }
}