public class Test26 {

    public static void main(String[] args) {
        int m = 6, n = 5;
        int A[][] = {{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 0, 1}, {1, 0, 1, 1, 1}};
        int r = Math.min(m, n);
        r = explore(A, r);
        System.out.println(r);
    }



    static int explore(int[][] A, int p) {
//        System.out.println("02===" + p);
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(" " + A[i][j] + " ");
                if (A[i][j] != 1) {
//                    System.out.println("x " + i);
//                    System.out.println("y " + j);
                    if(i == 1 && j == 1) {
                        return 0;
                    } else {
                        return explore(A, Math.min(i,j));
                    }
                }
            }
            System.out.println(" ");
        }
        return p;
    }


}
