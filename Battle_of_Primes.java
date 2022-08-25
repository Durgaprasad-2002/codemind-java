import java.util.*;
class battle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,m;
        a=sc.nextInt();
        b=sc.nextInt();
        m=a+b;
        c=m;
        for (int i=1;i<=c;i++)
        {
            c+=1;
            int k=0;
            for (int j=1;j<=c/2;j+=1)
            {
                if (c%j==0)
                {
                    k+=1;
                }
            }
            if (k==1)
            {
                System.out.println(c-m);
                break;
            }
        }
        
    }
}