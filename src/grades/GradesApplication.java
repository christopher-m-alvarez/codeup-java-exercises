package grades;



import util.Input;
import java.util.HashMap;

public class GradesApplication {

    static Input input = new Input();

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student chris = new Student("chris");
        chris.addGrade(80);
        chris.addGrade(85);
        chris.addGrade(77);

        Student kim = new Student("kim");
        kim.addGrade(80);
        kim.addGrade(85);
        kim.addGrade(77);

        Student john = new Student("john");
        john.addGrade(80);
        john.addGrade(85);
        john.addGrade(77);

        Student smith = new Student("smith");
        smith.addGrade(80);
        smith.addGrade(85);
        smith.addGrade(77);

        students.put("chris-codeup", chris);
        students.putIfAbsent("kim-codeup", kim);
        students.putIfAbsent("john-codeup", john);
        students.putIfAbsent("smith-codeup", chris);

        lineInterface(students);

    }

    public static void lineInterface(HashMap<String, Student> students){
        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:");

        do {

            for (String key : students.keySet()) {
                System.out.print("|" + key + "| ");
                System.out.println("\n");
            }

            System.out.println("Who would you like information on?\n");

            String userKey = input.getString();

            if (students.containsKey(userKey)) {

                Student currentStudent = students.get(userKey);

                System.out.println("Name: " + currentStudent.getStudentName() + "GitHub Username: " + userKey);
                System.out.println("Current Average: " + currentStudent.getGradeAverage());

            } else {
                System.out.println("not a valid username " + userKey);
            }

            System.out.println("Would you like to see another student?");
        } while (input.yesNo());

        System.out.println("later tator");

    }
}
