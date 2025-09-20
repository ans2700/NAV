package Strings;

public class RemAAcFromString {
    public static String remaac(String s)
    {
        int n=s.length();
        String ans="";
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='a')
            {
                if(s.charAt(i+1)=='c')
                {
                    i++;
                }
            }
            else{
                ans+=s.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String args[])
    {
        System.out.println(remaac("aacb"));
        System.out.println(remaac("abcac"));  
        System.out.println(remaac("aacac"));
    }
}
