import java.util.*;
class valid
{
    public static boolean square(int m)
    {
        double sq;
        sq=Math.sqrt(m);
        if ((sq-(int)sq)>0)
            return false;
        else
            return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int m;
            m=sc.nextInt();
            if (square(m))
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}