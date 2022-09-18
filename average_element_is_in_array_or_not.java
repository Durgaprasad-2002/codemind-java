import java.util.*;
class avg
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s=0,h=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int a;
            a=sc.nextInt();
            x[i]=a;
            s+=a;
        }
        s=s/n;
        for(int j=0;j<n;j++)
        {
            if (x[j]==s)
            {
                h=1;
                System.out.println("True");
                break;
            }
        }
        if (h==0)
            System.out.println("False");
    }
}