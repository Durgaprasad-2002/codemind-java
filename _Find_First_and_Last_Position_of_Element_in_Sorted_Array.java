import java.util.*;
class firstandlast
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        k=sc.nextInt();
        int i1=-1,i2=-1,f=0,l=n-1;
        for(int i=f;i<n;i++)
        {
            if(x[i]==k)
            {
                i1=i;
                break;
            }
        }
        for(int i=l;i>-1;i--)
        {
            if(x[i]==k)
            {
                i2=i;
                break;
            }
        }
        System.out.println(i1+" "+i2);
    }
}