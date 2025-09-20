package Arrays;

public class SumOfMinMax {
    public static int MaxEl(int arr[])
    {
        int large=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>large)
            {
                large=arr[i];
            }
        }
        return large;
    }
    public static int MinEl(int arr[])
    {
        int smallest=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<smallest)
            {
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public static int SumMinMax(int large,int smallest)
    {
        return large+smallest;
    }
    public static void main(String args[])
    {
        int arr[]={2,3,4,1,4};
        int large = MaxEl(arr);
        int smallest = MinEl(arr);
        int sum=SumMinMax(large, smallest);
        System.out.println("largest:"+large);
        System.out.println("Smallest:"+smallest);
        System.out.println(sum);
    }
}
