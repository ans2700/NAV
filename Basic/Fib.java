package Basic;

// public class Fib {
//     public static int fibo(int n)
//     {
//         if(n==0 || n==1)
//         {
//             return 1;
//         }
//         else
//         {
//             return n*fibo(n-1);
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println(fibo(3));
//     }
// }
public class Fib{
    public static void main(String args[])
    {
        int a=0;
        int b=1;
        int c=1;
        int num=10;
        for(int i=1;i<=num;i++)
        {
            System.out.print(a+",");
            a=b;
            b=c;
            c=a+b;
        }
        System.out.print("end");
    }
}
