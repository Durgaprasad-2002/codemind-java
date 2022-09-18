import java.util.*;
class hh
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int h=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int a;
            a=sc.nextInt();
            x[i]=a;
            if (a%2!=0)
                h=i;
        }
        System.out.println(h);
    }
}