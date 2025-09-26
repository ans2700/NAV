package Strings;

public class Number {
    public static void main(String args[])
    {
        String s="aaaa";
        int n=s.length();
        int slen=0;
        int st=0;
        for(int i=0;i<n;i++)
        {
            boolean vis[]=new boolean[26];
            for(int j=i;j<n;j++)
            {
                if(vis[s.charAt(j)-'a']==true)
                break;
            
            else
            {
                if(slen<j-i+1)
                {
                    slen=j-i+1;
                    st=i;

                }
                
                vis[s.charAt(j)-'a']=true;
            }
        }
    }
    System.out.println("String is":+s.substring(st,st+slen));
}
}
