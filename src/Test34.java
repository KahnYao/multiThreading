import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test34 {

    public static void main(String[] args) {

        List<Stu> stus = new ArrayList<Stu>() {
            {
                add(new Stu(20160001, "孔明", 20, 1, "土木工程", "武汉大学"));
                add(new Stu(20160002, "伯约", 21, 2, "信息安全", "武汉大学"));
                add(new Stu(20160003, "玄德", 22, 3, "经济管理", "武汉大学"));
                add(new Stu(20160004, "云长", 21, 2, "信息安全", "武汉大学"));
                add(new Stu(20161001, "翼德", 21, 2, "机械与自动化", "华中科技大学"));
                add(new Stu(20161002, "元直", 23, 4, "土木工程", "华中科技大学"));
                add(new Stu(20161003, "奉孝", 23, 4, "计算机科学", "华中科技大学"));
                add(new Stu(20162001, "仲谋", 22, 3, "土木工程", "浙江大学"));
                add(new Stu(20162002, "鲁肃", 23, 4, "计算机科学", "浙江大学"));
                add(new Stu(20163001, "丁奉", 24, 5, "土木工程", "南京大学"));
            }
        };


        List<Stu> whuStudents = stus.stream().filter(student -> "武汉大学".equals(student.getSchool())).collect(Collectors.toList());
        whuStudents.forEach(stu -> {
            System.out.println(stu.getName());
        });


        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 4);

        List<Integer> evens = nums.stream()
//                .filter(num -> num % 2 == 0).distinct()
                .filter(num -> num % 2 == 0).distinct()
                .collect(Collectors.toList());

        System.out.println(evens.toString());


        List<Stu> civilStudents = stus.stream()
                .filter(student -> "土木工程".equals(student.getMajor()))
                .sorted((s1, s2) -> s1.getAge() - s2.getAge())
//                .limit(3)
                .skip(3)
                .collect(Collectors.toList());

        civilStudents.forEach(stu -> {
            System.out.println(stu.getName() + stu.getAge());
        });


        Integer ageSum = stus.stream()
                .mapToInt(Stu::getAge)
                .sum();
        Long countNum = stus.stream().count();
        System.out.println(ageSum);
        System.out.println(countNum);

        System.out.println("==============================================");

        List<Stu> stus1 = stus.stream()
                .filter(stu -> !"土木工程".equals(stu.getMajor()))
                .sorted((s1, s2) -> s1.getAge() - s2.getAge())
                .collect(Collectors.toList());
        stus1.forEach(stu -> {
            System.out.println(stu.getName() + " " + stu.getAge() + " " + stu.getMajor());
        });

        System.out.println("==============================================");

        List<String> stus2 = stus.stream()
                .filter(stu -> "计算机科学".equals(stu.getMajor()))
                .map(Stu::getName)
                .collect(Collectors.toList());

//        stus2.forEach(stu -> {
            System.out.println(stus2.toString());
//        });

        System.out.println("==============================================");


        List<String> names = stus.stream()
                .filter(student -> "计算机科学".equals(student.getMajor()))
                .map(Stu::getName)
                .collect(Collectors.toList());


        System.out.println("==============================================");



        String[] strs = {"java8", "is", "easy", "to", "use"};

        List<String[]> distinctStrs = Arrays.stream(strs)
                .map(str -> str.split(""))  // 映射成为Stream<String[]>
                .distinct()
                .collect(Collectors.toList());


        distinctStrs.forEach(strings -> {
            System.out.println(strings.toString());
        });


        System.out.println("==============================================");



    }

}


class Stu {

    /**
     * 学号
     */
    private long id;

    private String name;

    private int age;

    /**
     * 年级
     */
    private int grade;

    /**
     * 专业
     */
    private String major;

    /**
     * 学校
     */
    private String school;

    // 省略getter和setter

    public Stu(long id, String name, int age, int grade, String major, String school) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.major = major;
        this.school = school;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
