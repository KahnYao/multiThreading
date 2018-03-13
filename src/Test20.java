public class Test20 {

    public int rsPartition(int[] array, int l, int r) {
        int pivot = array[l];
        int i = l + 1;
        int tmp;
        for (int j = l + 1; j < r; j++) {
            if (array[j] < pivot) {
                tmp = array[j];
                array[j] = array[i];
                array[i] = tmp;
                i += 1;
            }
        }
        tmp = array[l];
        array[l] = array[i - 1];
        array[i - 1] = tmp;
        return i - 1;
    }

    public int rselect(int[] array, int l, int r, int order) {
        if (r - l == 0) return array[l];
        int index = rsPartition(array, l, r);
        if (index == order) return array[index];
        if (index > order) return rselect(array, l, index, order);
        return rselect(array, index + 1, r, order - index);
    }

    public static void main(String[] args) {
        int array[] = {2, 3, 2, 2, 5, 11, 2};
        int length = 7;
        Test20 test = new Test20();
        System.out.println(test.rselect(array, 3, length, (length - 1) / 2));
    }
}
