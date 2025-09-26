package Qs;

public class Fib {
    public static int fib(int n)
    {
        if(n<=1)
        {
        return n;
        }
        else
        {
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String args[])
    {
        // int a=0;
        // int b=1;
        // int c=1;
        // int tar=5;
        // for(int i=1;i<=tar;i++)
        // {
        //     a=b;
        //     b=c;
        //     c=a+b;
        // }
        System.out.println(fib(5));
    }
}
