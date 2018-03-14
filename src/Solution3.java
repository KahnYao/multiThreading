public class Solution3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int m = 6, n = 5;
        int A[][] = {{1, 1, 1, 1, 1}, {1, 1, 1, 0, 1}, {1, 1, 0, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 0, 1}, {1, 1, 1, 1, 1}};
        int r = Math.min(m, n);
        r = move_square(A, r);
        System.out.print("最大方形的L: ");
        System.out.println(r-1);
    }


    /**
     * @param A
     * @param p
     * @return
     */
    private static int move_square(int[][] A, int p) {
        System.out.println("\n=== " + p);
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(" " + A[i][j] + " ");
                if (A[i][j] != 1) {
                    if ((i == 1 && j == 1) || (i == 0 && j == 1) || (i == 1 && j == 0)) {
                        return 0;
                    }
                    return move_square(A, Math.max(i, j));
                }
            }
            System.out.println(" ");
        }
        return p;
    }
}
