import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test33 {

    public static void main(String[] args) {


        Stream stream = Stream.of("a", "b", "c");


//        stream.forEach(System.out::println);

//        String [] strArray = new String[] {"a", "b", "c", "d"};
//        String [] strArray1 = new String[] {"1", "2", "3", "4"};
//        stream = Arrays.stream(strArray);
//        stream.forEach(System.out::println);

//        List<String> list = Arrays.asList(strArray);
//        stream = list.stream();
//        stream.forEach(System.out::println);


//        System.out.println(ArrayUtils.toString(strArray));
//        System.out.println(ArrayUtils.toMap(new String[][] { strArray, strArray1}));

//        IntStream.of(new int[]{1, 2, 3}).forEach(System.out::println);
//        IntStream.range(1, 3).forEach(System.out::println);


        //流转换为其它数据结构
//        String[] strArray2 = stream.toArray(String[]::new);

//        String str = stream.collect(Collectors.joining(",")).toString();
//        System.out.println(str);

        //平方数
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squareNums = nums.stream().
                map(n -> n * n).
                collect(Collectors.toList());

        Long countNum = nums.stream().count();
        Integer sumNum = nums.stream().mapToInt(n -> n).sum();
        System.out.println(squareNums.toString());
        System.out.println(countNum.intValue());
        System.out.println(sumNum);


    }


}
