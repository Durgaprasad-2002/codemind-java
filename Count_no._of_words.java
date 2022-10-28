import java.util.*;
class noofwords
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int w=1;
		for (int i=0;i<s1.length();i++)
		{
			if (s1.charAt(i) ==' ' && s1.charAt(i+1)!=' ')
				w+=1;
		}
		if (s1.length()==0)
			System.out.println(0);
		else
			System.out.println(w);
	}
}