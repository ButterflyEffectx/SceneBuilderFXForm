package Personnel;


import java.util.Objects;

public class Alumni extends People{

    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

//    public String showInfo() {
//        return "Alumni info: ID = " + getID() + ", Name = " + getName() + ", Salary = " + getSalary() + ", Bonus = " + computeBonus(salary);
//    }

    public double computeBonus(int rate){
        return rate * 0.1;
    }

    @Override
    public int payTax(int income) {
        double res = 0;
        res = (income < 150000) ? 0 : (income * 0.05);
        return (int) res;
    }

    @Override
    public int getWelfare(String type) { // ถอนฟัน 400 ลาคลอด 10000 ตกงาน 15000
        if(Objects.equals(type, "ถอนฟัน")) {
            return 400;
        } else if (Objects.equals(type,"คลอดบุตร")) {
            return 10000;
        }
        else{
            return 15000;
        }
    }

    public String registerAlumni(int year, String gender) {
        return register(year,gender);
    }


//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        Alumni a = new Alumni();
//
//        System.out.print("Enter your id: ");
//        a.setID(scan.next());
//
//        System.out.println("Your id is: " + a.getID());
//    }
}
