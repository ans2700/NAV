package JavaBasic;

public class FirstNonRepeatingCharacter {
    public static char nonrepeat(String s)
    {
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            boolean repeated=false;
            for(int j=0;j<n;j++)
            {
                if(i!=j && s.charAt(i)==s.charAt(j))
                {
                    repeated=true;
                    break;
                }
            }
            if(!repeated){
                return s.charAt(i);
            }
        }
        return 0;
    }
    public static void main(String args[])
    {
        String s="gge";
        System.out.println(nonrepeat(s));
    }
}
