public class Test24 {

    public static void main(String[] args) {
        int max = 1;
        int m = 6, n = 4;

        int A[][] = {{0, 1, 1, 1}, {1, 0, 1, 1}, {1, 1, 0, 1}, {1, 1, 1, 0}, {0, 1, 1, 0}, {1, 0, 1, 1}};


//        for (int i = 0; i < m; i++)
//            for (int j = 0; j < n; j++)
//                scanf("%d", & matrix[i][j]);


        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                if (A[i][j] == 1) {
                    int mmin = Math.min(A[i - 1][j], A[i][j - 1]);
                    mmin = Math.min(A[i - 1][j - 1], mmin);
                    A[i][j] = mmin + 1;
                    if (max < A[i][j])
                        max = A[i][j];
                }
        System.out.println(max);
    }

}
