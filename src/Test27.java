public class Test27 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int m = 6, n = 5;
        int A[][] = {{1, 1, 1, 1, 1}, {1, 1, 1, 0, 1}, {1, 1, 0, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 0, 1}, {1, 1, 1, 1, 1}};
        int r = Math.min(m, n);
        r = explore(A, r);
        System.out.println("\n****");
        System.out.println(r);
    }


    /**
     * @param A
     * @param p
     * @return
     */
    static int explore(int[][] A, int p) {
        System.out.println("\n02===" + p);
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(" " + A[i][j] + " ");
                if (A[i][j] != 1) {
                    System.out.print("\nx " + i);
                    System.out.print("\ny " + j);
                    if ((i == 1 && j == 1) || (i == 0 && j == 1) || (i == 1 && j == 0)) {
                        return 0;
                    }
                    return explore(A, Math.max(i, j));
                }
            }
            System.out.println(" ");
        }
        return p;
    }


}
