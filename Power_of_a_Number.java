import java.util.*;
class power
{
    public static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y,m,r1,r2;
        x=sc.nextInt();
        y=sc.nextInt();
        m=sc.nextInt();
        r1=(int)Math.pow(x,y);
        r2=r1%m;
        System.out.println(r2);
    }
}