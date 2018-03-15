public class Solution4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int A[][] = {{2, 3, 4, 8}, {5, 7, 9, 12}, {1, 0, 6, 10}, {9, 3, 7, 11}};
        int[] result = circlePrint(A, 3, 4);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    /**
     * @param A
     * @param n
     * @param m
     * @return
     */
    private static int[] circlePrint(int[][] A, int n, int m) {
        int startX = 0;
        int endX = m - 1;
        int startY = 0;
        int endY = n - 1;
        int index = 0;
        int[] result = new int[n * m];

        while (startX <= endX && startY <= endY) {
            // From left to right
            if (startX <= endX) {
                for (int i = startX; i <= endX; i++) {
                    result[index++] = A[startY][i];
                }
            }

            // From top to bottom
            if (startY < endY) {
                for (int i = startY + 1; i <= endY; i++) {
                    result[index++] = A[i][endX];
                }
            }
            // From right to left
            if (startX < endX && endY > startY) {
                for (int i = endX - 1; i >= startX; i--) {
                    result[index++] = A[endY][i];
                }
            }

            // From bottom to top
            if (startY < endY && endX > startX) {
                for (int i = endY - 1; i >= startY + 1; i--) {
                    result[index++] = A[i][startX];
                }
            }

            startX++;
            endX--;
            startY++;
            endY--;
        }
        return result;
    }

}
