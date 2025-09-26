package Strings;
public class LongestSubstring {
    public static void main(String[] args) {
        String sub;
        String s="abcdefgh";
        int n=s.length();
        for(int i=n;i>=1;i--)
        {
            for(int j=0;j<=n-i;j++)
            {
                sub=s.substring(j,j+i);
                System.out.println(sub);
                
            }   

        }   
         
    }
}
