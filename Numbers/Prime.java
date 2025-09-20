package Numbers;

public class Prime {
    public static boolean prime(int n)
    {
        int num=n;
        for(int i=2;i<n;i++)
        {
            if(num%i==0)
            {
                return false;
                
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("The number is prime:"+prime(21));
    }
}
