import java.util.Scanner;
import java.io.*;


public class ConsoleExercises {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // Declarations

// #2
//        System.out.println("Enter three words.");
//        String string1 = in.next();
//        System.out.println("You entered: --> \"" + string1 + "\" <--");
//
//        String string2 = in.next();
//        System.out.println("You entered: --> \"" + string2 + "\" <--");
//
//        String string3 = in.next();
//        System.out.println("You entered: --> \"" + string3 + "\" <--");

// #3
//        String string4 = in.nextLine();
//        System.out.println("You entered: --> \"" + string4 + "\" <--");

        System.out.println("Enter a length and width.");
        int userLength = in.nextInt();
        int userWidth = in.nextInt();
        System.out.println("The Area is: --> " + (userLength * userWidth) + "<--");
        System.out.println("The perimeter is: --> " + ((userLength * 2) + (userWidth * 2)) + "<--");






//        System.out.print("Enter something: ");
//        int userInput = scanner.nextInt();
//        String userInput = scanner.next();


//        System.out.println("You entered: --> \"" + userInput + "\" <--");

// #1
//        double pi = 3.14159;
//
//        System.out.format("%.2f%n", pi);
    }

}





