package Strings;
public class Reverse {
    public static String rev(String str)
    {
        int n=str.length();
        String a="";
        for(int i=n-1;i>=0;i--)
        {
            a+=str.charAt(i);
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(rev("abc def"));
    }
}
