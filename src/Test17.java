public class Test17 {

    public static void main(String[] args) {

        System.out.println("hello test17!");

        int arr[] = {6, 7, 8, 9};

        System.out.println("This array the largest value is : " + "");

        System.out.println("The array size is : " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

        System.out.println("\n==========================");

        String str = "abcdefg";


        System.out.println("One of string random pick is : " + str.charAt(2));

        char chars[] = str.toCharArray();

        for (int j = 0; j < chars.length; j++) {
            System.out.print(" " + chars[j]);
        }

        System.out.println("\n==========================");

        for (char c : chars) {
            System.out.print(" " + c);
        }

        System.out.println("\n==========================");

        Boolean flag = true;
        int m = 0;
        while (flag) {
            System.out.print(" " + m++);
            if (m == 20) {
                flag = false;
            }
        }

        System.out.println("\n==========================");

        int num1[][] = {{0, 1, 2}, {3, 4}, {5}};

        for (int i = 0; i < num1.length; i++) {
            System.out.print("二维数组输出值为：");
            for (int j = 0; j < num1[i].length; j++) {
                System.out.print(" " + num1[i][j]);//num1[i][j] 我只说明第一行吧，比如 num1[0][1] 就是 num1[0]指num1里的{0,1,2} 这个对象。
            }
            System.out.println();
        }


    }

}
