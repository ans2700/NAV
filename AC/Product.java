package AC;
import java.util.*;

public class Product {
    public static int pro(int a,int b)
    {
        int product=a*b;
        return product;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt(); 
       System.out.println("Product of two numbers:"+pro(a, b));
    }
    
}
