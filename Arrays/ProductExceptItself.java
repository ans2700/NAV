package Arrays;

public class ProductExceptItself {

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    prod *= arr[j];
                }
            }
            ans[i] = prod;
        }
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
