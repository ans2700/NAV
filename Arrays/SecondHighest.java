package Arrays;

public class SecondHighest {
    public static int SecHigh(int arr[])
    {
        int high = Integer.MIN_VALUE;    
        int second = Integer.MIN_VALUE; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > high) {
                
                second = high;
                high = arr[i];
            } else if (arr[i] > second && arr[i] != high) {

                second = arr[i];
            }
        }

        return second;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Second Highest: " + SecHigh(arr));
    }
}

   
