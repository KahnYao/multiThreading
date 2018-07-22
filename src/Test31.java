import org.apache.commons.lang3.ArrayUtils;

public class Test31 {

    public static void main(String[] args) {

        String [] strArray = new String[] {"a", "b", "c"};

//        for (String str : strArray) {
//            System.out.println(str);
//        }

//        String str2 = StringUtils.join(Arrays.asList(strArray), ",");
//
//        System.out.println(str2);

//        String test = "";
//        String test2 = "\n\n\t";
//        String test3 = null;
//        String test4 = "Test";
//
//
//        System.out.println( "test blank? " + StringUtils.isBlank( test ) );
//        System.out.println( "test2 blank? " + StringUtils.isBlank( test2 ) );
//        System.out.println( "test3 blank? " + StringUtils.isBlank( test3 ) );
//        System.out.println( "test4 blank? " + StringUtils.isBlank( test4 ) );


          //清除空白字符
//        String test1 = "\t";
//        String test2 = "  A  Test  ";
//        String test3 = null;
//
//        System.out.println( "test1 trimToNull: " + StringUtils.trimToNull( test1 ) );
//        System.out.println( "test2 trimToNull: " + StringUtils.trimToNull( test2 ) );
//        System.out.println( "test3 trimToNull: " + StringUtils.trimToNull( test3 ) );

        //取得字符串的缩写
//        String test = "This is a test of the abbreviation.";
//        String test2 = "Test";
//
//        System.out.println( StringUtils.abbreviate( test, 15 ) );
//        System.out.println( StringUtils.abbreviate( test, 5,15 ) );
//        System.out.println( StringUtils.abbreviate( test2, 10 ) );

        //劈分字符串
//        String input = "A b,c.d|e";
//        String input2 = "Pharmacy, basketball funky";
//
//        String[] array1 = StringUtils.split( input, " ,.|");
//        String[] array2 = StringUtils.split( input2, " ,", 2 );
//
//
//        System.out.println( ArrayUtils.toString( array1 ) );
//        System.out.println( ArrayUtils.toString( array2 ) );

        //重复字符串
//        System.out.println( StringUtils.repeat( "*", 10));
//        System.out.println( StringUtils.repeat( "China ", 5));


        //颠倒字符串
//        System.out.println( StringUtils.reverse("ABCDE"));

        //判断字符串内容的类型
//        String state = "Virginia";
//        System.out.println( "Is state number? " + StringUtils.isNumeric(
//                state ) );
//        System.out.println( "Is state alpha? " + StringUtils.isAlpha( state )
//        );
//        System.out.println( "Is state alphanumeric? " +StringUtils.isAlphanumeric( state ) );
//        System.out.println( "Is state alphaspace? " + StringUtils.isAlphaSpace( state ) );

        //

        System.out.println(ArrayUtils.toString(new int[] { 1, 4, 2, 3 }));// {1,4,2,3}
        System.out.println(ArrayUtils.toString(new Integer[] { 1, 4, 2, 3 }));// {1,4,2,3}
        System.out.println(ArrayUtils.toString(null, "I'm nothing!"));// I'm nothing!




    }

}
