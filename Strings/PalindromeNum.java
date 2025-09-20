package Strings;

public class PalindromeNum {

    public static boolean palin(int num) {
        int org=num;
        int rev=0;
        while(num>0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(rev==org)
        {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        System.out.println("Palindrome:"+palin(121));
        System.out.println("Palindrome:"+palin(123));
    }
}
