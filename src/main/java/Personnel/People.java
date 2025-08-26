package Personnel;

public abstract class People {
    static int cntMaleYear34 = 0;
    static int cntMaleYear35 = 0;
    static int cntFemaleYear34 = 0;
    static int cntFemaleYear35 = 0;

    public abstract int payTax(int income);

    public abstract int getWelfare(String type);

    public String register(int year, String gender) {
        String idType;
        gender = gender.trim().toLowerCase();
            if (gender.equals("male")) {
                if (year == 34) {
                    idType = "1";
                    cntMaleYear34++;
                    return idType + year + cntMaleYear34;
                } else if (year == 35) {
                    idType = "1";
                    cntMaleYear35++;
                    return idType + year + cntMaleYear35;
                }
            } else if (gender.equals("female")) {
                if (year == 34) {
                    idType = "2";
                    cntFemaleYear34++;
                    return idType + year + cntFemaleYear34;
                } else if (year == 35) {
                    idType = "2";
                    cntFemaleYear34++;
                    return idType + year + cntFemaleYear35;
                }
            }

        return "Invalid gender";
    }
}
