import java.util.*;
class avg
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        double s=0.00;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int a;
            a=sc.nextInt();
            x[i]=a;
            s+=a;
        }
        s=(double)s/n;
        System.out.printf("%.2f",s);
    }
}