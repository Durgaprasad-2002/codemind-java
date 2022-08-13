import java.util.*;
class pandemic
{
    public static void main(String args[])
    {
        int h;
        Scanner sc=new Scanner(System.in);
        h=sc.nextInt();
        if (h<3)
        {
            System.out.println(h-1);
        }
       
        else
        {
            System.out.println(2);
        }
    }
}