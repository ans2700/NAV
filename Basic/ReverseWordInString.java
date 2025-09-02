package Basic;
public class ReverseWordInString {
    
    public static void main(String[] args) {
        String word="Hello World";
        String rev="";
        for(int i=word.length()-1;i>=0;i--)
        {
            rev=rev+word.charAt(i);
        }
        
        System.out.println(rev);
    }
}
