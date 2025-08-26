package Personnel;

import java.util.Objects;

public class Merchant extends People {

    @Override
    public int payTax(int income) {
        double res = 0;
        res = (income < 150000) ? 1000 : ((income * 0.05)+1000);
        return (int) res;
    }

    @Override
    public int getWelfare(String type) {
        if(Objects.equals(type, "ถอนฟัน")) {
            return 400;
        } else if (Objects.equals(type,"คลอดบุตร")) {
            return 10000;
        }
        else{
            return 15000;
        }
    }
}
