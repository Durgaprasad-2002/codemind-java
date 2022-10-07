import java.util.Scanner;
class ab
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],even[],odd[],i,j=0,k=0,n;
        n=sc.nextInt();
        x=new int[n];
        for(i=0; i<n; i++)
        
            x[i]=sc.nextInt();
        even=new int[n];
        odd=new int[n];
        for(i=0; i<n; i++)
        {
            if(x[i]%2==0)
                even[j++]=x[i];
            else
                odd[k++]=x[i];
        }
        for(i=0; i<j; i++)
        {
            System.out.print(even[i]+" ");
        }
        for(i=0; i<k; i++)
        {
            System.out.print(odd[i]+" ");
            
        }
        
    }
}