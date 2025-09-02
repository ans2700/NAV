package Basic;

public class BinarySearch {
    public static int binarysearch(int arr[], int tar) {
        int st = 0, end = arr.length - 1;

        while (st <= end) {
            int mid = (st + end) / 2;

            if (tar < arr[mid]) {
                end = mid - 1;
            } else if (tar > arr[mid]) {
                st = mid + 1;
            } else {
                return mid; // found
            }
        }
        return -1; // not found
    }


    public static void main(String args[])
    {
        int evenarr[]={1,3,5,12,16,19};
        int oddarr[]={1,3,5,7,9};
        int tar=19;
        int even=binarysearch(evenarr,tar);
        int odd=binarysearch(oddarr,tar);
        System.out.println("Result for even:"+even);
        System.out.println("Result for odd:"+odd);

    }
    
}
