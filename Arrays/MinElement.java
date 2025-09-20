package Arrays;

public class MinElement {
    public static void main(String args[])
    {
        int smallest=0;
        int arr[]={3,2,1,0,3};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<smallest)
            {
                smallest=arr[i];
            }
        }
        System.out.println(smallest);
        }
    
}
