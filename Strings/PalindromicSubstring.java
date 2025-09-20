package Strings;
import java.util.*;
public class PalindromicSubstring {
    public static boolean palindrome(String s)
    {
        int left=0;
        int right=s.length()-1;
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
    public static Set<String> sub(String s)
    {
        int n=s.length();
        Set<String> res=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                String subs=s.substring(i,j);
                System.out.println(subs+" "+i+" "+j);
                if(palindrome(subs))
                {
                    res.add(subs);
                }
            }
            
        }
        return res;
    }
    public static void main(String args[])
    {
        String s="bababa";
        Set<String>ans = sub(s);
        System.out.println(ans);
    }
}
