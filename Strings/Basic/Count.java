    package Strings.Basic;

    public class Count {
        public static void main(String[] args) {
            
        String s="abc";
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                c++;
            }
        }
        System.out.println("Count of characters:"+c);
    }
    }
