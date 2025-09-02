package Basic;
public class BinarySearchRecursive {

    public static int BSRecursive(int arr[], int s, int e, int tar) {
        int mid = s + (e - s) / 2;
        if (s > e) {
            return -1;
        }
        if (tar < arr[mid]) {
            return BSRecursive(arr, s, mid - 1, tar);
        } else if (tar > arr[mid]) {
            return BSRecursive(arr, mid + 1, e, tar);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int arr[]={10,15,19,25,35,36,49};
        int tar=48;
        int res=BSRecursive(arr, 0, arr.length-1, tar);
        if(res!=-1)
        {
            System.out.print("Result found at:"+res);
        }
        else
        {
            System.out.println("Not found");
        }

    }
}

