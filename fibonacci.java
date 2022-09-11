import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c;
        n=sc.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i=1;i<=n-2;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        
    }
}