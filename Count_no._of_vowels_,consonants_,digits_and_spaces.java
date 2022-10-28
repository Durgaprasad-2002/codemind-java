import java.util.*;
class vccount
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int v=0,c=0,d=0,s=0;
		for (int i=0;i<s1.length();i++)
		{
			if (s1.charAt(i)==' ')
			{
				s+=1;
			}
			else if (s1.charAt(i)=='0' || s1.charAt(i)=='1' || s1.charAt(i)=='2' || s1.charAt(i)=='3' || s1.charAt(i)=='4' || s1.charAt(i)=='5' || s1.charAt(i)=='6' || s1.charAt(i)=='7' || s1.charAt(i)=='8' || s1.charAt(i)=='9')
			{
			    d+=1;
			}
			else if (s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u')
				v+=1;
			else if (s1.charAt(i)=='A' || s1.charAt(i)=='E' || s1.charAt(i)=='I' || s1.charAt(i)=='O' || s1.charAt(i)=='U')
				v+=1;	
			else
				c+=1;
		}
		System.out.println("Vowels: "+v);
		System.out.println("Consonants: "+c);
		System.out.println("Digits: "+d);
		System.out.println("White spaces: "+s);
	}
}