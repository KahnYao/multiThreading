public class Solution1 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int A[] = {5, 2, 1, 6, 3, 7};
        int m = breakChain(A, 6);
        System.out.println(m);
    }


    /**
     *
     * @param A
     * @param N
     * @return
     */
    private static int breakChain(int A[], int N) {
        int m = A[0] + A[2];
        int n;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 2; j < A.length; j++) {
                n = A[i] + A[j];
                m = Math.min(m, n);
            }
        }
        return m;
    }
}
