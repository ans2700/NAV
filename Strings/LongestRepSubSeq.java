package Strings;

public class LongestRepSubSeq {
    public static void main(String[] args) {
        String s="axxyyxxxyaaaa";
        int maxlen=1;
        int currlen=1;
        char maxc=s.charAt(0);
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                currlen++;
                if (currlen > maxlen) {
                    maxlen = currlen;
                    maxc = s.charAt(i);
                }
            }
            else
            {
                currlen=1;
            }
        }
        System.out.println("Longest Repeating Subsequence Character:"+maxc);
        System.out.println("Longest Repeating Subsequence Count:"+maxlen);
    }
}
