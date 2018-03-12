import java.util.Scanner;

public class Test21 {

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
            findMaxM(arr, 0, n - 1, m);
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    /**
     * @param arr
     * @param l
     * @param r
     * @return
     */
    static int quick(int[] arr, int l, int r)//大的放左边，小的放右边
    {
        int x = arr[l];
        int i = l;
        int j = r;
        while (true) {
            while (i < j && arr[j] <= x)
                j--;
            if (i < j) {
                arr[i] = arr[j];
                i++;
            } else
                break;
            while (i < j && arr[i] >= x)
                i++;
            if (i < j) {
                arr[j] = arr[i];
                j--;
            } else
                break;
        }
        arr[i] = x;
        return i;
    }

    /**
     * @param arr
     * @param l
     * @param r
     * @param m
     */
    static void findMaxM(int[] arr, int l, int r, int m) {
        if (l >= r)
            return;
        int mid = quick(arr, l, r);
        if (mid == m - 1 || mid == m)
            return;
        else if (mid > m)
            findMaxM(arr, l, mid - 1, m);
        else if (mid < m - 1)
            findMaxM(arr, mid + 1, r, m);
    }
}
