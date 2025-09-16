package Personnel;
import Item.Subject;

import java.util.ArrayList;

public class Student extends Person {


    ArrayList<Subject> sbj = new ArrayList<Subject>();
    

    public boolean addSubject(Subject subject){ //ถ้าลงทะเบียนได่ return true ถ้าไม่ได้ false

        int totalUnit = 0;
        for(Subject s : sbj){
            totalUnit += s.getUnit();
        }
        totalUnit += subject.getUnit();
        sbj.add(subject);
        return totalUnit < 21;
    }

    public int getTotalUnit(){
        int total = 0;
        for(Subject s : sbj){
            total += s.getUnit();
        }
        return total;
    }

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


