package Strings;

public class Anagram {
    public static void main(String[] args) {
        String s1="listen";
        String s2="silentee";
        int[] freq=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            freq[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++)
        {
            freq[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]!=0)
            {
            System.out.println("not anagram");
            return;
            }
        }
            System.out.println("anagram");

    }
}
