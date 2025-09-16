package Main;

import HR.Lecture;
import HR.Special;
import HR.Staff;
import Item.Subject;
import Personnel.Alumni;
import Personnel.Merchant;
import Personnel.People;
import Personnel.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student std = new Student();

        while (true) {
            Subject sub = new Subject();

            System.out.print("Enter Subject ID : ");
            sub.setId(sc.nextLine());

            System.out.print("Enter Subject Name : ");
            sub.setName(sc.nextLine());

            System.out.print("Enter Subject Unit : ");
            sub.setUnit(sc.nextInt());
            sc.nextLine();

            if(std.addSubject(sub)){
                System.out.println("ลงทะเบียนสำเร็จ หน่วยกิตปัจจุบัน : "+std.getTotalUnit());
            }else {
                System.out.println("หน่วยกิตเกินไม่สามารถลงได้ หน่วยกิตเกิน 21");
                break;
            }
        }

//        Subject thai = new Subject("1","ภาษาไทย",3);
//        Subject com = new Subject("2","คอมพิวเตอร์",3);
//        Subject eng = new Subject("3","ภาษาอังกฤษ",3);
//        Subject sci = new Subject("4","วิทยาศาสตร์",20);
//        Subject[] subjects = {thai, com, eng, sci};
//
//        if(std.addSubject(subjects)){
//            System.out.println("ลงทะเบียนสำเร็จ");
//        }else{
//            System.out.println("ไม่สามารถลงทะเบียนได้");
//        }

//        Lecture lt = new Lecture();
//        Staff st = new Staff();
//
//        System.out.print("Enter you scholar value : ");
//        System.out.println("Your Bonus : "+lt.evaluate(scan.nextInt()));
//        lt.setSalary(3000);
//        System.out.println("Bonus OT Lecturer : "+ lt.computeOT(26.5) + " bucks");
//        System.out.println("Bonus OT Staff : "+ st.computeOT(17) + " bucks");
//
//        System.out.println("================================");
//        System.out.println("Increase Hours Staff : "+lt.increaseSalary(7,8));
//        System.out.println("Increase Hours Staff : "+st.increaseSalary(5,15));


//            Alumni a = new Alumni();
//            Merchant m = new Merchant();
//
//            System.out.println("People : "+a.payTax(150001));
//            System.out.println("Merchant : "+m.payTax(140000));
//
//            System.out.println("ถอนฟัน : "+a.getWelfare("ถอนฟัน"));
//            System.out.println("คลอดบุตร : "+a.getWelfare("คลอดบุตร"));
//            System.out.println("ตกงาน : "+a.getWelfare("ตกงาน"));
//
//             System.out.println("YEAR : 34");
//
//            System.out.println("register id : "+a.register(34,"male"));
//            System.out.println("register id : "+a.register(34,"male"));
//            System.out.println("register id : "+a.register(34,"female"));
//            System.out.println("register id : "+a.register(34,"female"));
//
//
//            System.out.println("YEAR : 35");
//
//            System.out.println("register id : "+m.register(35,"male"));
//            System.out.println("register id : "+m.register(35,"male"));
//            System.out.println("register id : "+m.register(35,"female"));
//            System.out.println("register id : "+m.register(35,"female"));
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
