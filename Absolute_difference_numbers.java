import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d,d1,d2,l;
        n=sc.nextInt();
        d=sc.nextInt();
        l=(int)Math.log10(n)+1;
        d2=n%(int)Math.pow(10,d);
        d1=n/(int)Math.pow(10,l-d);
        System.out.println(Math.abs(d1-d2));
    }
}