package Personnel;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StudentPool {

    ArrayList<Student> std = new ArrayList<Student>();

    public void addStudents(Student s  ) {
        std.add(s);
        int index = std.size();
        System.out.println("Student ID : " + index + " insert successfully");
    }

//    public void showAllStudents() {
//        System.out.println("----- Student List -----");
//        for (Student s : std) {
//            System.out.println("Student ID: " + s.getID());
//            System.out.println("Name      : " + s.getName());
//            System.out.println("Score     : " + s.getScore());
//            System.out.println("-------------------------");
//        }
//}
}
