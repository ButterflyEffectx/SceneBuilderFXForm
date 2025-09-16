package HR;

public interface HR {
    String id = null;
    String name = null;
    int salary = 0;


    void setSalary(double salary);
    double computeOT(double hrs);
    double increaseSalary(int fstHrs, int scdHrs);
}