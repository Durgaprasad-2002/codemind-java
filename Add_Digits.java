import java.util.*;
class adddigits
{
    public static int digit(int n)
    {
        int sum=0,d;
        int j=0;
        while (n>0)
        {
            d=n%10;
            n=n/10;
            sum+=d;
            j++;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r;
        n=sc.nextInt();
        for(int i=1;;i++)
        {
            if (n>9)
		{
               n=digit(n);
		}
            else
		{
                System.out.println(n);
                break;
		}
        }
    }
}