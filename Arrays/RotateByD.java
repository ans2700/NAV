package Arrays;

public class RotateByD {
    public static void shift(int arr[],int d)
    {
        int n=arr.length;
        d=d%n;
        int temp[]=new int[d];
        for(int i=0;i<d;i++)
        {
            temp[i]=arr[i];
        }
        for(int i=d;i<n;i++)
        {
            arr[i-d]=arr[i];
        }
        for(int i=n-d;i<n;i++)
        {
            arr[i]=temp[i-(n-d)];
        }

    }
    public static void main(String args[])
    {
        int arr[]={3,2,4,5,6};
        int d=2;
        shift(arr,d);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
 