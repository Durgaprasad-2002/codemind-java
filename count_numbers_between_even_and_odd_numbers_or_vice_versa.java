import java.util.*;
class hh
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        int c=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int a;
            a=sc.nextInt();
            x[i]=a;
        }
        for(int j=1;j<n-1;j++)
        {
            if ((x[j-1]%2!=0)  && (x[j+1]%2!=0))
                c+=1;
            else if ((x[j-1]%2==0)  && (x[j+1]%2!=0))
                c+=1;
        }
        System.out.println(c);
    }
}