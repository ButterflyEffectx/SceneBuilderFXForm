package Main;

import Personnel.Alumni;
import Personnel.Merchant;
import Personnel.People;
import Personnel.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



            Alumni a = new Alumni();
            Merchant m = new Merchant();

            System.out.println("People : "+a.payTax(150001));
            System.out.println("Merchant : "+m.payTax(140000));

            System.out.println("ถอนฟัน : "+a.getWelfare("ถอนฟัน"));
            System.out.println("คลอดบุตร : "+a.getWelfare("คลอดบุตร"));
            System.out.println("ตกงาน : "+a.getWelfare("ตกงาน"));

             System.out.println("YEAR : 34");

            System.out.println("register id : "+a.register(34,"male"));
            System.out.println("register id : "+a.register(34,"male"));
            System.out.println("register id : "+a.register(34,"female"));
            System.out.println("register id : "+a.register(34,"female"));


            System.out.println("YEAR : 35");

            System.out.println("register id : "+m.register(35,"male"));
            System.out.println("register id : "+m.register(35,"male"));
            System.out.println("register id : "+m.register(35,"female"));
            System.out.println("register id : "+m.register(35,"female"));
//        Student s = new Student();
//
//        System.out.print("Enter your id: ");
//        a.setID(scan.next());
//
//        System.out.print("Enter your name: ");
//        a.setName(scan.next());
//
//        System.out.print("Enter your salary: ");
//        a.setSalary(scan.nextInt());
//
//        System.out.print("Enter your score: ");
//        s.setScore(scan.nextInt());
//
//        s.setID(a.getID());
//        s.setName(a.getName());
//
//        System.out.println(a.showInfo());
//        System.out.println(s.showInfo());
    }
}
