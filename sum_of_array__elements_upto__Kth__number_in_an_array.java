import java.util.*;
class notin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int c;
            c=sc.nextInt();
            x[i]=c;
        }
        a=sc.nextInt();
        int s=0;
        for(int j=0;j<n;j++)
        {
            s+=x[j];
            if (x[j]==a)
                break;
        }
        System.out.println(s);
    }
}