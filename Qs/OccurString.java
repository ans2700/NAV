package Qs;
public class OccurString {
    public static void main(String args[])
    {
        String s="abcabdtgfabcjuiabclkjhabc";
        String st="abc";
        int lastIndex=0;
        int count=0;
        while(lastIndex!=-1)
        {
            lastIndex=s.indexOf(st,lastIndex);
            if(lastIndex!=-1)
            {
                count++;
                lastIndex+=st.length();
            }
            
        }
        System.out.println(count);
        
    }
}
