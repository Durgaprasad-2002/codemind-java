import java.util.*;
class minimumdiff
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sn=0,l=0,r=0;
        int sq=0;
        n=sc.nextInt();
        for(int i=1;sq<=n;i++)
        {
            sq=(int)(Math.pow(2,i));
            if (sq<=n)
            {
                sn=sq;
            }
        }
        l=n-sn;
        r=(sn*2)-n;
        if (l<r)
            System.out.println(l);
        else
            System.out.println(r);
    }
}