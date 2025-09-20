package Strings;

public class CheckRotations {
    public static boolean rotations(String s1,String s2)
    {
        int n=s1.length();
        for(int i=0;i<n;i++)
        {
            if(s1.equals(s2))

            {
                return true;
            }
            char last=s2.charAt(s2.length()-1);
            s2=last+s2.substring(0,s2.length()-1);
            System.out.println(s2);
        }
        return false;
    }
    public static void main(String[] args) {
        String s1="abcd";
        String s2="cdab";
        System.out.println(rotations(s1,s2));
    }
}
