    package Strings.Basic;

    public class Count {
        public static void main(String[] args) {
            
        String s="abc";
        int c=0;
        int c1=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                c++;
            }
        }
        for(char i: ch)
        {
            c1++;
        }
        System.out.println("Count of characters:"+c+" "+c1);
    }
    }
