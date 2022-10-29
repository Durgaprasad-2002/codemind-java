import java.util.*;
class evenDigits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,co=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int c=0;
            x[i]=sc.nextInt();
            while (x[i]>=1)
            {
                x[i]=x[i]/10;
                c+=1;
            }
            if (c%2==0)
                co+=1;
        }
        System.out.println(co);
    }
}