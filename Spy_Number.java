import java.util.*;
class strongnumber
{
    public static boolean digit(int n)
    {
        int sum=0,mul=1,d;
        int i=1;
        while (n>0)
        {
		int r1=0;
            d=n%10;
            n=n/10;
            sum+=d;
            mul*=d;
            i++;
        }
        if (sum==mul)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r;
        n=sc.nextInt();
        if (digit(n))
            System.out.println("Spy Number");
        else
            System.out.println("Not Spy Number");
    }
}