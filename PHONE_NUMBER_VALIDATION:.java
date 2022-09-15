import java.util.*;
class phonenumber 
{
    public static boolean check(long n)
    {
        long c=0,d=0;
        int i=0;
        while (n>0)
        {
            d=n%10;
            n=n/10;
            c+=1;
            i++;
        }
        if (c==10&&d!=0)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String m;
        m=sc.nextLine();
        long n = Long.parseLong(m);
        if (check(n))
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}