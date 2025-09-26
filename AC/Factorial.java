package AC;

public class Factorial {
    // public static int fact(int n)
    // {
    //     int f=0;
    //     if(n==0||n==1)
    //     {
    //         return 1;
    //     }
    //     else
    //     {
    //         f=n*fact(n-1);
    //     }
    //     return f;
    // }
    // public static void main(String[] args) {
    //     int n=3;
    //     int f=1;
    //     for(int i=n;i>=1;i--)
    //     {
    //         f=f*i;
    //     }
    //     System.out.println(f);
    //     System.out.println(fact(n));
    // }
    public static void main(String[] args) {
        int n=5;
        int ans=1;
        for(int i=1;i<=n;i++)
        {
            ans=ans*i;
        }
        System.out.println(ans);

    }
    }
