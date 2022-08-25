import java.util.*;
class factcount
{
 public static int findFactor(int x)
 {
  int c=0;
  for(int i=1;i<=x/2;i++)
	{
	 if(x%i==0)
		{
		  c+=i;
		}
	}
	return(c);
 }
 public static void main(String args[])
 {
 	Scanner sc=new Scanner(System.in);
 	int n,res;
    n=sc.nextInt();
	res=findFactor(n);
	if (n==res)
	{
	    System.out.println("True");
	}
	else
	{
	    System.out.println("False");
	}
   
    
 }

}