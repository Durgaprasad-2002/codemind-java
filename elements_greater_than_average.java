import java.util.*;
class hh
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int c=0,s=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int a;
            a=sc.nextInt();
            x[i]=a;
            s+=a;
        }
        s=(int)s/n;
        for(int j=0;j<n;j++)
        {
            if (x[j]>=s)
                c+=1;
        }
        System.out.println(c);
    }
}