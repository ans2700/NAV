package AC;

public class EvenOdd {
    public static boolean EO(int n)
    {
        if(n%2 ==0 )
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.print("Given number is Even:");
        System.out.print(EO(3));
    }
}
