package Personnel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;



public class StudentPool {

    ArrayList<Student> std = new ArrayList<Student>();

    public void addStudents(Student s  ) {
        std.add(s);
        int index = std.size();
        System.out.println("Student ID : " + index + " insert successfully");
    }

    public String searchStudentNameByID(String id){
        String name = "";
        for (Student s : std) {
            if (s.getID().equals(id)) {
                name = s.getName();
            }
        }

        return name;
    }

    //displayStudentInfo()
    public void displayStudentInfo() {
        for (Student s : std) {
            System.out.println("ID: " + s.getID());
            System.out.println("Name: " + s.getName());
            System.out.println("Score: " + s.getScore());
            System.out.println("--------------------------");
        }
    }

//    public void exportToFile(String filename) {
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
//            for (Student s : std) {
//                System.out.println("ID: " + s.getID());
//                writer.newLine();
//                System.out.println("Name: " + s.getName());
//                writer.newLine();
//                System.out.println("Score: " + s.getScore());
//                writer.newLine();
//                System.out.println("--------------------------");
//                writer.newLine();
//            }
//            System.out.println("Export success.");
//        } catch (IOException e) {
//            System.out.println("Error writing file: " + e.getMessage());
//        }
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

