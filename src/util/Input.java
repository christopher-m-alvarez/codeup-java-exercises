package util;



import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Say something");
        String userString = scanner.nextLine();
         return userString;
    }

    public boolean yesNo(){
        System.out.println("(y/n)?");
        String userAnswer = scanner.nextLine();
        return userAnswer.equals("y");
    }

    public int getInt(int min,int max){
        System.out.println("type an integer");
        int userInt = scanner.nextInt();

        if (userInt < min || userInt > max){
            System.out.println("try again");
            return getInt(min,max);
        } else {
            System.out.println("good");
            return userInt;
        }
    }

    public int getInt() {
        System.out.println("type an integer");
        int userInt = scanner.nextInt();
        return userInt;
    }


    public Double getDouble(double min,double max){
        System.out.println("type a decimal number");
        double userDouble = scanner.nextDouble();

        if (userDouble < min || userDouble > max){
            System.out.println("try again");
            return getDouble(min,max);
        } else {
            System.out.println("good");
            return userDouble;
        }
    }

    public double getDouble() {
        System.out.println("Give me a decimal: ");
        double userDouble = scanner.nextDouble();
        return userDouble;
    }

}
