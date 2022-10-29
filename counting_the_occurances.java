import java.util.*;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        char c;
        int co=0;
        s=sc.nextLine();
        c=sc.next().charAt(0);
        for(int i=0;i<s.length();i++)
        {
            if (s.charAt(i)==c)
            {
                co+=1;
            }
        }
        if (co!=0)
            System.out.println(co);
        else    
            System.out.println(-1);
    }
}