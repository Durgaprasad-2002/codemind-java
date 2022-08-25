import java.util.*;
class factcount
{
 public static int findFactor(int x,int y,int z)
 {
  int c=0;
  for(int i=x;i<=y;i++)
	{
	 if(i%z==0)
		{
		  c+=1;
		}
	}
	return(c);
 }
 public static void main(String args[])
 {
 	Scanner sc=new Scanner(System.in);
 	int l,r,k,res;
    l=sc.nextInt();
    r=sc.nextInt();
    k=sc.nextInt();
	res=findFactor(l,r,k);
	System.out.println(res);
   
    
 }

}