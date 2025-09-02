
package AC;
public class Prime {
    // public static boolean prime(int n)
    // {
    //     if(n==2)
    //     {
    //         return true;
    //     }
    //     for(int i=2;i<=n-1;i++)
    //     {
    //         if(n%i==0)
    //         {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    //optimized
    public static boolean prime(int n)
    {
        if(n==2)
        {
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void primeinrange(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(prime(i))
            {       
                System.out.print(i+" ");
            }
        }

    }
    public static void main(String[] args) {
        System.out.println("Prime:"+prime(2));
        System.out.print("Prime in range using helper function:");
        for(int i=2;i<=10;i++)
        {
            if(prime(i))
            {
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        System.out.print("Prime in range using helper function in a function:");
        primeinrange(30);
    }

}
