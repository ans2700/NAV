package Strings.Basic;

public class Reverse {
    public static void rev(String str)
    {
        String ans="";
        for(int i=str.length()-1;i>=0;i--)
        {
            ans+=str.charAt(i);
        }
        System.out.println("Reverse String:"+ans);
    }
    public static void main(String[] args) {
        String s="abc";
        rev(s);
    }
}
