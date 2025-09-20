package Strings;

public class ReplaceAwithAc {
    public static String rep(String s)
    {
        String str="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                str+="ac";
            }
            else
            {
                str+=s.charAt(i);
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String s="abc";
        System.out.println(rep(s));
    }
}
