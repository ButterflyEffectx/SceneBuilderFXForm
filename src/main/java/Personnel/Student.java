package Personnel;

public class Student extends Person {

    private int score;

    public String showInfo(){
        String info = null;
        info = "Student info : " + " ID = " + getID() + ", Name = " + getName() + ", Score = " + getScore() + ", Grade = " + genGrade(score);
        return info;
    }

    public void setScore(int i) {
        this.score = i;
    }

    public int getScore() {
        return score;
    }

    public String genGrade(int score) {
        return score <= 40 ? "F" :
                score <= 45 ? "D" :
                        score <= 50 ? "D+" :
                                score <= 55 ? "C" :
                                        score <= 60 ? "C+" :
                                                score <= 65 ? "B" :
                                                        score <= 70 ? "B+" : "A";
    }
}


