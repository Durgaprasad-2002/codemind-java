import java.util.*;
class duplicate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int x[]=new int[n];
        for (int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int h=0;
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                if(x[i]==x[j] && i!=j)
                {
                    h=1;
                    System.out.println(x[i]);
                    break;
                }
            }
            if (h==1)
            {
                break;
            }
        }
        if (h==0)
        {
            System.out.println(-1);
        }
    }
}