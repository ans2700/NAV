package AC;

public class DecToBin {
    public static void dec(int n)
    {
        int bin=0;
        int pow=0;
        int decn=n;
        while(n>0)
        {
            int rem=n%2;
            bin=bin+rem*(int)Math.pow(10,pow);
            pow++;
            n=n/2;
        }
        System.out.println("Binary value of "+decn+" is "+bin);
    }
    public static void main(String[] args) {
        dec(12);
    }
}
