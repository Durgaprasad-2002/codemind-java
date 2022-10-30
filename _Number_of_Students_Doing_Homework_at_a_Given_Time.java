import java.util.*;
class majority
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2,q,c=0;
        n1=sc.nextInt();
        int x[]=new int[n1];
        for (int i=0;i<n1;i++)
        {
            x[i]=sc.nextInt();
        }
        n2=sc.nextInt();
        int y[]=new int[n2];
        for (int i=0;i<n2;i++)
        {
            y[i]=sc.nextInt();
        }
        q=sc.nextInt();
        for(int i=0;i<n1;i++)
        {
            if (x[i]<=q && q<=y[i])
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}