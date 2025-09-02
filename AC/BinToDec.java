package AC;
public class BinToDec {
    public static void BinNum(int n)
    {
        int binnum=n;
        int dec=0;
        int pow=0;

        while(n>0)
        {
            int last=n%10;
            dec=dec+(last*(int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
       
        System.out.println("Decimal of:"+binnum+" is "+dec);
    }
    public static void main(String[] args) {
        
        BinNum(101);
    }
}
