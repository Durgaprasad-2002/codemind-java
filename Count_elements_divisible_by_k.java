import java.util.*;
class divide
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,a,c=0;
        n=sc.nextInt();
        k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a=sc.nextInt();
            if (a%k==0)
                c+=1;
        }
        System.out.println(c);
    }
}