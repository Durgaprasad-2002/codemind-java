import java.util.*;
class hh
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int c=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int a;
            a=sc.nextInt();
            x[i]=a;
            if (a%2==0)
                continue;
            else
            {
                c=1;
                break;
            }
        }
        if (c==1)
            System.out.println("False");
        else
            System.out.println("True");
    }
}