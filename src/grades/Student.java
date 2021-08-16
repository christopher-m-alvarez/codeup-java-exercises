package grades;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class Student {
    private String studentName;
    private ArrayList<Integer> grades;

    public Student(String studentName) {
        this.studentName = studentName;
        this.grades = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;
        for (Integer grade: this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }



    //    public Student(String studentName, ArrayList<Integer> grades) {
//        this.studentName = studentName;
//        this.grades = new ArrayList<>;
//    }
}
