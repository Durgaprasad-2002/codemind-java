import java.util.*;
class strongnumber
{
    public static int dsum(int d)
    {
        int s=1;
        for(int i=1;i<=d;i++)
        {
            s*=i;
        }
        return s;
    }
    public static int digit(int n)
    {
        int d=0,sum=0;
        int i=1;
        while (n>0)
        {
		int r1=0;
            d=n%10;
            n=n/10;
		r1=dsum(d);
            sum+=r1;
            i++;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r;
        n=sc.nextInt();
        r=digit(n);
        if (n==r)
            System.out.println("The number "+n+" is a strong number");
        else
            System.out.println("The number "+n+" is not a strong number");
    }
}