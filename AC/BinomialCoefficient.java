package AC;

public class BinomialCoefficient {
    public static int ncr(int n)
    {
        int f=0;
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            f=n*ncr(n-1);
        }
        return f;
    }
    public static void main(String[] args) {
        int n=5;
        int r=2;
        int diff=n-r;
        int res=ncr(n)/(ncr(diff)*ncr(r));
        System.out.println(res);
    }
}
