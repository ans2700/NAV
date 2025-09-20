package Numbers;

public class SumOfN {
    public static int sumofn(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        int res=n+sumofn(n-1);
        return res;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println("Sum of "+n+" numbers is:"+sumofn(5));
    }
}
