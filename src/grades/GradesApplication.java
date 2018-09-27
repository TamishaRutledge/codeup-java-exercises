package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args){

        HashMap<String, Student> students = new HashMap<>();

        Student danny = new Student("danny");
        danny.addGrade(76);
        danny.addGrade(86);
        danny.addGrade(96);
        students.put("danTheMan", danny);

        Student francis = new Student("francis");
        francis.addGrade(86);
        francis.addGrade(66);
        francis.addGrade(56);
        students.put("frankTheTank", francis);

        Student teddy = new Student("teddy");
        teddy.addGrade(76);
        teddy.addGrade(86);
        teddy.addGrade(46);
        students.put("teddyTalkTech", teddy);

        Student justin = new Student("justin");
        justin.addGrade(76);
        justin.addGrade(73);
        justin.addGrade(80);
        students.put("justInTime", justin);

        System.out.println(students);

    }
}
