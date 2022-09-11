import java.util.*;
class reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2,b,s;
        n1=sc.nextInt();
        n2=sc.nextInt();
        if (n1>n2)
        {
            b=n1;
            s=n2;
        }
        else
        {
            b=n2;
            s=n1;
        }
        for(int i=b/2;i>0;i--)
        {
            if (b%i==0)
            {
                if (s%i==0)
                {
                    System.out.println(i);
                    break;
                }
            }
        }
        
    }
}