package grades;

import java.util.ArrayList;

public class Student {

    private ArrayList<String> studentName = new ArrayList<>();
    private ArrayList<Double> grades = new ArrayList<>();

    public Student(ArrayList studentName, ArrayList grades) {
        this.studentName = studentName;
        this.grades = grades;
    }

    // returns the student's name
    public String getName();
    // adds the given grade to the grades property
    public void addGrade(int grade);
    // returns the average of the students grades
    public double getGradeAverage();

    public static void main(String[] args){
        
    }
}
