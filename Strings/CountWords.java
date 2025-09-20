package Strings;

public class CountWords {
    public static int countw(String s)
    {
        int c=0;
        int n=s.length();
        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)==' ')
            {
                c++;
            }
        }
        return c;
    }

    public static void main(String args[])
    {
        System.out.println("Count of Words:"+countw("Hello World"));
    }
}
