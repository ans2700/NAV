package Arrays;

public class ThirdHighest {
    public static int thirdHighest(int arr[])
    {
        int third=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                third=second;
                second=largest;
                largest=arr[i];
            }
            else if(arr[i]>second && arr[i]!=largest)
            {
                second=arr[i];
            }
            else if(arr[i]>third && arr[i]!=second)
            {
                third=arr[i];
            }

        }
        System.out.println("Largest is:"+largest);
        System.out.println("Second Highest:"+second);
        return third;

    }
    public static void main(String args[])
    {
        int arr[]={2,3,4,5,4};
        System.out.println("Third Highest is:"+thirdHighest(arr));
        
    }
}
