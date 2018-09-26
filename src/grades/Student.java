package grades;
import java.util.Scanner;
import java.util.ArrayList;

public class Student {

    private String studentName;
    private ArrayList<Double> grades;

    public Student(String studentName) {
        this.studentName = studentName;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return this.studentName;
    }
    // adds the given grade to the grades property
    public void addGrade(double grade){
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double gradesTotal = 0;
        for (double grade:this.grades) gradesTotal += grade;
        return gradesTotal / this.grades.size();
    }

    public static void main(String[] args){

        Student Johnny = new Student("Johnny");
        Johnny.addGrade(43);
        Johnny.addGrade(92);
        Johnny.addGrade(84);
        System.out.println(Johnny.getName());
        System.out.println(Johnny.getGradeAverage());

        Student JimBob = new Student("JimBob");
        JimBob.addGrade(76.4);
        JimBob.addGrade(98.3);
        JimBob.addGrade(80);
        System.out.println(JimBob.getName());
        System.out.println(JimBob.getGradeAverage());

    }
}
