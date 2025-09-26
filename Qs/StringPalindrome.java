package Qs;
import java.util.*;
public class StringPalindrome {
    public static boolean palin(String s)
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
    public static void main(String args[])
    {
        String s="bcbaa";
        int n=s.length();
        // boolean ans=false;
        // String s1="";
        // String valid="";
        Set<String>pali=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                String s1=s.substring(i,j);
                if(palin(s1))
                {
                    pali.add(s1);
                }

            }
        }
        for(String i:pali)
        {
            System.out.println(i);
        }
    }
}
