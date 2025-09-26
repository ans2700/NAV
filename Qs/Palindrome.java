package Qs;

public class Palindrome {
    public static void main(String[] args) {
        String s="madame";
        int left=0;
        int right=s.length()-1;
        boolean ans=true;
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                ans=false;
            }
            else
            {
                ans=true;
            }
            left++;
            right--;
        }
        if(ans)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
