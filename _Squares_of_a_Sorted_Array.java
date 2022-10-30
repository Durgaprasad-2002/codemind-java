import java.util.*;
class majority
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1;
        n1=sc.nextInt();
        int x[]=new int[n1];
        for (int i=0;i<n1;i++)
        {
            int a;
            a=sc.nextInt();
            x[i]=a*a;
        }
        Arrays.sort(x);
        for (int i=0;i<n1;i++)
        {
            System.out.print(x[i]+" ");
        }
        
    }
}