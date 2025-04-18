import java.util.ArrayList;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Student s1=new Student(1,24,7);
        Student s2=new Student(2,26,9);
        Student s3=new Student(3,23,5);
        ArrayList<Student> list=new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Comparator<Student> byAge =new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        };
        list.sort(byAge);
        System.out.println(list);
    }
}