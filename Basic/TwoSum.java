package Basic;

public class TwoSum {
    static boolean twoSum(int[] arr,int tar)
    {
       
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int sum=arr[i]+arr[j];
                if(sum==tar)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        int arr[]={2,3,4,5,6,7};
        int tar=14;
        System.out.println("Result:"+twoSum(arr, tar));
    }
    
}
