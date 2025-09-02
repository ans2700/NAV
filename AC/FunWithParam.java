package AC;
import java.util.*;
public class FunWithParam {
    public static int Sum(int a,int b)
    {
        int s;
        s=a+b;
        return s;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int su=a+b;
        System.out.println("Sum is:"+su);
        System.out.print("Sum of two numbers is:"+Sum(a,b));
    }
    
}
