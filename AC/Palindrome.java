package AC;

public class Palindrome {
    public static boolean Palin(int n)
    {
        int p=0;
        int pow=0;
        int m=n;
        while(n!=0)
        {
            int rem=n%10;
            p=p*10+rem;  
            pow++;
            n=n/10;
        }
        System.out.println(p);
        if(m==p)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.print("Palindrome:");
        System.err.print(Palin(1351));
    }
    
}
