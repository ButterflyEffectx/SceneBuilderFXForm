package HR;

public class Staff implements HR {

    String id = null;
    String name = null;
    double salary = 0;


    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double computeOT(double hrs) {
        return hrs * 200;
    }

    @Override
    public double increaseSalary(int fstHrs, int scdHrs) {
        double totalHr = ((fstHrs * 1) + (scdHrs * 0.5));

        if (totalHr > 15) {
            if (totalHr * 52 > 200){
                return salary * 0.4;
            }
            return salary * 0.3;
        }
        System.out.println("ชั่วโมงต่อสัปดาห์ไม่ถึง 10 ชั่วโมง");
        return 0;
    }

}
