package Numbers;

public class Factorial {
    public static int fact(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        int res=n*fact(n-1);
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Factorial:"+fact(5));
    }
}
//Optimized approach

