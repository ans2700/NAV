package Arrays;

public class Move0s {
    public static void main(String[] args) {
        // int[] arr={1,0,0,1};
        // int n=arr.length;
        // int temp=0;
        // for(int i=0;i<n-1;i++)
        // {
        //         int j=i+1;
        //         if(arr[j]==0)
        //         {
        //             temp=arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //         }
        // }
        // for(int i=0;i<n;i++)
        // {System.err.println(arr[i]+" ");}
        int arr[] = {12, 0, 0, -13, 0};
        int n=arr.length;
        int index=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[index++]=arr[i];
            }
        }
        while(index<n)
        {
            arr[index++]=0;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
