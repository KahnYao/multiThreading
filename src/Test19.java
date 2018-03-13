public class Test19 {

    public static void main(String[] args) {
        int num[] = {5, 2, 1, 6, 3, -7};
        int a = num[0] + num[2];
        int b;
        for (int i = 0; i < num.length; i++) {
            System.out.println("====");
            System.out.print("A输出值为：" + num[i] + " \n ");
            for (int j = i + 2; j < num.length; j++) {
                System.out.print("B输出值为：" + num[j] + " \n ");
                b = num[i] + num[j];
                a = Math.min(a, b);
                System.out.print(num[i] + num[j]);
                System.out.println();
            }
        }
        System.out.println("最小值为：" + a);
    }

}
