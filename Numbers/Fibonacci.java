package Numbers;

public class Fibonacci {
    public static int fib(int n)
    {
        if(n<=1)
        {
            return n;
        }
        int res=fib(n-1)+fib(n-2);
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Fibonacci of 5 is:"+fib(5));
    }
}
//Another approach
