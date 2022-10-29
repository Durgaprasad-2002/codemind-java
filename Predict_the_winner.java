import java.util.*;
class win
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x1=0,y1=0,d1;
        n=sc.nextInt();
        int x[]=new int[n];
        for (int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            if (i%2==0)
                x1+=x[i];
            else
                x1+=x[i];
        }
        d1=x1-y1;
        if (d1<0)
            d1=d1/-1;
        if (d1%4==0)
            System.out.println("X");
        else
            System.out.println("Y");
        
    }
}