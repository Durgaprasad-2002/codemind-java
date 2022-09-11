import java.util.*;
class lcm
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
        for(int i=1;;i++)
        {
            if (b*i%s==0)
            {
                System.out.println(b*i);
                break;
            }
        }
        
    }
}