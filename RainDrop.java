import java.util.*;
class ranidrop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n%3==0&&n%5==0&&n%7==0)
        {
            System.out.print("PlingPlangPlong");
        }
        else if(n%3==0&&n%5==0)
        {
             System.out.print("PlingPlang");
        }
        else if(n%3==0&&n%7==0)
        {
             System.out.print("PlingPlong");
        }
        else if(n%7==0&&n%5==0)
        {
             System.out.print("PlangPlong");
        }
        else if(n%3==0 ||n%5==0||n%7==0)
        {
            if(n%3==0)
            {
                System.out.println("Pling");
            }
            else if(n%5==0)
            {
                 System.out.println("Plang");
            }
            else
            
             System.out.println("Plong");
                
        }
        else
        {
             System.out.println(n);
        }
    }
}