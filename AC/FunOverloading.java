package AC;
import java.util.*;
public class FunOverloading {
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    public static float sum(float a,float b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        float d,e;
        d=sc.nextFloat();
        e=sc.nextFloat();

        System.out.println("Sum of two numbers:"+sum(a,b));
        System.out.println("Sum of two numbers:"+sum(d,e));
        System.out.println("Sum of two numbers:"+sum(a,b,c));
    }
    
}
