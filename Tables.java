import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d;
        n=sc.nextInt();
        d=sc.nextInt();
        for(int i=1;i<=d;i++)
        {
            if (i%2!=0)
            {
                System.out.println(n+" x "+i+" = "+n*i);
            }
        }
        
    }
}