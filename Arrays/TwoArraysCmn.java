package Arrays;

public class TwoArraysCmn {
    public static void main(String args[])
    {
        int arr[]={4,1};
        int arr1[]={1,2,3,4};
        System.out.print("Common elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i] == arr1[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
