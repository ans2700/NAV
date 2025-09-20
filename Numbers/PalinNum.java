package Numbers;

public class PalinNum {
    public static boolean Palindrome(int n)
    {
        int org=n;
        int rev=0;
        while(n!=0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==org)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Number is Palindrome:"+Palindrome(121));
    }
}
