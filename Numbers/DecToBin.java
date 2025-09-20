package Numbers;

public class DecToBin {
    public static String dectobin(int dec)
    {
        String s="";
        while(dec>0)
        {
            int rem=dec%2;
            s+=(int)rem;
            dec=dec/2;
        }
        return s;
    }
    public static void main(String args[])
    {
        int dec=10;
        System.out.println(dectobin(dec));
    }
}
