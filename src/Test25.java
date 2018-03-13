public class Test25 {

    public static void main(String[] args) {


        int m = 6, n = 4;
        Integer r = null;
        int t = 0;
        Integer s = null;

        int A[][] = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 0}, {1, 1, 1, 0}, {1, 0, 1, 1}};

        //从0,0左上角开始起步
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                if(r != null && j > r) {
                    break;
                }

                //每一步落角点都为1
                if (A[i][j] == 1) {
                    System.out.print(" " + A[i][j] + " ");
                    t = j;
                } else {
                    s = j;
                    break;
                }

            }

            if(r == null) {
                r = t;
            } else {
                r = Math.min(r,t);
                if(r < t) {
                    break;
                }
            }

            if(s != null && s < r) {
                break;
            }

            System.out.println("  ");
        }
        System.out.println("****"+r);
    }

}
