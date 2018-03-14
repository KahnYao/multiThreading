public class Solution2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int N[] = {535, 25, 1126, 689, 3990, 7721, 3, 9999};
        int M[] = solve(N, 4);
        for (int i = 0; i < M.length; i++) {
            System.out.println(M[i] + " ");
        }
    }

    /**
     * @param A
     * @param m
     * @param s
     */
    static int[] heap(int[] A, int m, boolean s) {
        int[] M = new int[m];
        if (!s) {
            for (int i = 0; i < m; i++) {
                M[i] = A[i];
                if (M[0] > M[i]) {
                    swap(M, 0, i);
                }
            }
        } else {
            M = A;
        }
        for (int j = 0; j < M.length; j++) {
            if (M[0] > M[j]) {
                swap(M, 0, j);
            }
        }
        return M;
    }

    /**
     * @param A
     * @param m
     */
    static int[] solve(int[] A, int m) {
        int R[] = heap(A, m, false);
        for (int i = m; i < A.length; i++) {
            if (A[i] > R[0]) {
                R[0] = A[i];
                heap(R, m, true);
            }
        }
        return R;
    }

    /**
     * @param A
     * @param i
     * @param j
     */
    static int[] swap(int[] A, int i, int j) {
        A[i] = A[i] + A[j];
        A[j] = A[i] - A[j];
        A[i] = A[i] - A[j];
        return A;
    }
}
