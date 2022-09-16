import java.util.*;
class sort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,k,c=0;
        l=sc.nextInt();
        k=sc.nextInt();
        int x[]=new int[l];
        int i,j;
        for(i=0;i<l;i++)
        {
            x[i]=sc.nextInt();
        }
        for(j=0;j<l;j++)
        {
            if (x[j]%k!=0)
                c+=1;
        }
        System.out.println(c);
    }
}