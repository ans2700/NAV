package Qs;

public class LongestPalindromicSub {
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
    public static void main(String[] args) {
        String s="xyabcdedcbacc";
        int n=s.length()-1;
        boolean ans=false;
        for(int i=n;i>=1;i--)
        {
            for(int j=0;j<n-i;j++)
            {
                String s1=s.substring(j,j+i);
                if(palin(s1))
                {
                    System.out.println(s1);
                    break;
                }
            
            }
        }
        
    }
}
