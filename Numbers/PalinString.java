package Numbers;

public class PalinString {
    public static boolean Palindrome(String s)
    {
       int right=s.length()-1;
       int left=0;
       while(left<right)
       {
        if(s.charAt(left)!=s.charAt(right))
        {
            return false;
        }
        left++;
        right--;
       }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Palindrome:"+Palindrome("madame"));
    }
}
