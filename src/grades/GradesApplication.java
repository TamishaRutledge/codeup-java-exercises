package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args){

        HashMap<String, Student> students = new HashMap<>();

        Student danny = new Student("danny");
        danny.addGrade(76);
        students.put("danTheMan", danny);

        Student francis = new Student("francis");
        francis.addGrade(86);
        students.put("frankTheTank", francis);

        Student teddy = new Student("teddy");
        teddy.addGrade(76);
        students.put("teddyTalkTech", teddy);

        Student justin = new Student("justin");
        justin.addGrade(76);
        students.put("justInTime", justin);
        
    }
}
