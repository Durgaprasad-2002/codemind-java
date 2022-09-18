import java.util.*;
class celfh
{
     public static void main(String args[])
     {
          Scanner sc=new Scanner(System.in);
          int p,r,t;
          double a;
          p=sc.nextInt();
          r=sc.nextInt();
          t=sc.nextInt();
          a=p*(Math.pow((1+(double)r/100),t));
          System.out.printf("%.2f",a);
          
     }
}
