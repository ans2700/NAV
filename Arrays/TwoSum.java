package Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int arr[] = {1, 3, 1, 4, 5};
        int sum = 5;
        boolean res = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int s = arr[i] + arr[j];
                if (s == sum) {
                    System.out.println("Elements are:" + arr[i] + " " + arr[j]);
                    res = true;
                    break;
                }
            }
            if (res) {
                break;
            }
        }
        if (!res) {
            System.out.println("Not found");
        }
    }
}
