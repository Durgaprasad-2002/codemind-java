import java.util.*;
class search
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int k,h=0;
        k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if (x[i]==k)
            {
                System.out.println(i);
                h=1;
                break;
            }
        }
        if (h==0)
        {
            System.out.println(-1);
        }
    }
}