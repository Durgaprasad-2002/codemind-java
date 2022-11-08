import java.util.*;
class vccount
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s,r="",v="aeiou";
        s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            String ch=s.charAt(i)+"";
            if (v.contains(ch))
            {
                if (i!=0 && r.charAt(r.length()-1)!='V')
                {
                    r+="V";
                }
                else
                {
                    if (i==0)
                        r+="V";
                }
            }
            else
            {
                if (i!=0 && r.charAt(r.length()-1)!='C')
                {
                    r+="C";
                }
                else
                {
                    if (i==0)
                        r+="C";
                }
            }
        }
      
        System.out.println(r);
    }
}