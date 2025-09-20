package Arrays;

public class OneDuplicate {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,5};
        int n=arr.length-1;
        int sumactual=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        int duplicate=sum-sumactual;
        System.out.println("Duplicate value is:"+duplicate);
    }
}
