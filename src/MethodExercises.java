import java.util.Scanner;

public class MethodExercises {
    public static double addingMethod(double number, double secondNumber){
        return (number + secondNumber);
    }

    public static double subtractionMethod(double number, double secondNumber){
        return (number - secondNumber);
    }

    public static double multiplyMethod(double number, double secondNumber){
        return (number * secondNumber);
    }

    public static double divisionMethod(double number, double secondNumber){
        return (number / secondNumber);
    }

    public static double modulusMethod(double number, double secondNumber){
        return (number % secondNumber);
    }

    public static int getInteger(int min, int max){

        return getInteger(min, max);


    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number between 1 and 10: ");
//        double usersResponse =  scanner.nextLine();
//        usersResponse = getInteger(1,10);

        System.out.println(addingMethod(2,3));
        System.out.println(subtractionMethod(10,5));
        System.out.println(divisionMethod(50,5));
        System.out.println(multiplyMethod(20,5));
        System.out.println(modulusMethod(30, 3));


    }
}
