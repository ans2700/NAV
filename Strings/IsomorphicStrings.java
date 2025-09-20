package Strings;

public class IsomorphicStrings {
    public static boolean Iso(String a,String b)
    {
        if(a.length()!=b.length()) 
        {
            return false;
        }
        int[] m1=new int[256];
        int[] m2=new int[256];
        for(int i=0;i<a.length();i++)
        {
            char c1=a.charAt(i);
            char c2=b.charAt(i);
            if(m1[c1]!=m2[c2])
            return false;
            m1[c1]=i+1;
            m2[c2]=i+1;
        }
        return true;


    }
    public static void main(String[] args) {
        System.out.println(Iso("abc","xyz"));
        System.out.println(Iso("abc","xxz"));
    }
}
