package Numbers;

public class Armstrong {
    public static int order(int n)
    {
        int c=0;
        while(n!=0)
        {
            c++;
            n=n/10;
        }
        return c;
    }
    public static boolean armstrong(int n)
    {
        int num=n;
        int rev=0;
        int c=order(n);
        while(n!=0)
        {
            int rem=n%10;
            rev+=Math.pow(rem,c);
            n=n/10;
        }
        if(rev==num)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Armstrong number:"+armstrong(9474));
    }
}
