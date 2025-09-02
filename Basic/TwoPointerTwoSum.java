package Basic;
public class TwoPointerTwoSum {
    static boolean twoPointer(int arr[],int tar)
    {
        int n=arr.length;
        int s=0,end=n-1;
        while(s<end)
        {
            int sum=arr[s]+arr[end];
            if(sum==tar)
            {
                return true;
            }
            else if(sum<tar)
            {
                s++;
            }
            else
            {
                end--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7};
        int tar=14;
        System.out.println("Result:"+twoPointer(arr, tar));
        
    }
}
