package AC;

public class SumOfDigits {
    public static int sod(int n)
    {
        int s=0;
        while(n>0)
        {
            int rem=n%10;
            s=s+rem;
            n=n/10;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.print("Sum of digits of "+131+" is "+sod(131));
    }
}
