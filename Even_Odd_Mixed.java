import java.util.*;
class mixed
{
    public static int digit(int n)
    {
        int i=0,d=0,c=0;
        while (n>0)
        {
            d=n%10;
            if (d%2==0)
            {
               c+=2;
            }
            else if(d%2!=0)
            {
               c+=1;
            }
            n=n/10;
            i++;
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,l,r;
        n=sc.nextInt();
        l=(int)Math.log10(n)+1;
        r=digit(n);
        if (r==l*2)
            System.out.println("Even");
        else if (r==l)
            System.out.println("Odd");
        else
            System.out.println("Mixed");
    }
}