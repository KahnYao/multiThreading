import java.util.Scanner;

public class Test22 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            solve(arr, m);
        }
    }

    /**
     * @param arr
     * @param len
     * @param isOnlyRoot
     */
    static void minHeap(int[] arr, int len, boolean isOnlyRoot) {
        int s = isOnlyRoot ? 0 : len / 2 - 1;
        int d = 0;
        for (int i = s; i >= d; i--) {
            int k = i;
            for (int j = 2 * k + 1; j < len; k = j, j = 2 * k + 1) {
                if (j + 1 < len && arr[j + 1] < arr[j]) {
                    j = j + 1;
                }
                if (arr[k] > arr[j]) {
                    swap(arr, k, j);
                } else {
                    break;
                }
            }
        }
    }

    /**
     * @param arr
     * @param m
     */
    static void solve(int[] arr, int m) {
        minHeap(arr, m, false);
        for (int i = m; i < arr.length; i++) {
            if (arr[i] > arr[0]) {
                arr[0] = arr[i];
                minHeap(arr, m, true);
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    /**
     * @param arr
     * @param i
     * @param j
     */
    static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
}
