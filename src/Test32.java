import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


class Student1 {
    String name;
    String age;

    public Student1() {
    }

    public Student1(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}


public class Test32 {

    public static void main(String[] args) {
        List<Student1> stuList = new ArrayList<>();
        stuList.add(new Student1("wang", "18"));
        stuList.add(new Student1("li", "19"));
        stuList.add(new Student1("li", "20"));
        @SuppressWarnings("unchecked")
        List<String> nameList = (List<String>) CollectionUtils.collect(
                stuList, new Transformer() {
                    public Object transform(Object arg0) {
                        Student1 u = (Student1) arg0;
                        return u.getName();
                    }
                });
        Set<String> nameSet = new HashSet<>(nameList);
        System.out.println(nameSet);                        //[wang, li]
        System.out.println(StringUtils.join(nameSet.iterator(), ","));   //wang,li
    }

}
