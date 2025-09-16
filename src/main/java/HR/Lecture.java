package HR;
import Personnel.Person;

public class Lecture extends Person implements HR, Special{
    double salary = 0;
    String id = null;
    String name = null;



    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double computeOT(double hrs) {
        return ((double) salary / (30*8)) * hrs;
    }

    @Override
    public double increaseSalary(int fstHrs, int scdHrs) {

        double totalHr = ((fstHrs * 1) + (scdHrs * 0.5));

        if (totalHr > 10) {
            if (totalHr * 52 > 50){
                return salary * 0.4;
            }
                return salary * 0.3;
        }
            System.out.println("ชั่วโมงต่อสัปดาห์ไม่ถึง 10 ชั่วโมง");
        return 0;
    }

    @Override
    public int evaluate(int scholar) {
        int value = 0; //ทุนวิจัยต่ำกว่า 100,000 ได้ value 1,000
        //ทุนวิจัยตั้งแต่ 100,000 - 500,000 ได้ value 2,000
        //ทุนวิจัยตั้งแต่ 500,000 ได้ value 3,000
        if (scholar < 100000) {
            value = 1000;
        } else if (scholar <= 500000) {
            value = 2000;
        } else {
            value = 3000;
        }
        return value;
    }
}
