package Arrays;

public class MaxElement {
    public static void main(String args[])
    {
        int[] arr={1,2,7,4,5};
        int large=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>large)
            {
                large=arr[i];
            }
        }
        System.out.println("Largest element in the array is:"+large);
    }
}
