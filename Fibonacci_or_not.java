import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c;
        n=sc.nextInt();
        for(int i=1;;i++)
        {
            c=a+b;
            if (c==n)
            {
                System.out.println("True");
                break;
            }
            else if (c>n)
            {
                System.out.println("False");
                break;
            }
            a=b;
            b=c;
        }
        
    }
}