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
        if(number == 0){
            return secondNumber;
        }
        return number % secondNumber;
    }

    public static int getIntegerRecursion(int min, int max){

        Scanner userInput = new Scanner(System.in);

        System.out.print("Type a number between "+ min +" and "+ max +": ");
        int userNumber = userInput.nextInt();

        if ( userNumber>= min && userNumber <= max){
            return userNumber;
        }else {
            System.out.println(userNumber +" is out of range.");
            return getIntegerRecursion(min,max);
        }

    }


    public static int getInteger(int min, int max){

        Scanner userInput = new Scanner(System.in);

        int userResponse = min - 1;
        boolean hasLoopRanOnce = false;

        do {

            if (hasLoopRanOnce){
                System.out.println(userResponse +" is not within the range.");
            }

            System.out.print("Enter a number between "+ min +" and "+ max +": ");
            userResponse = userInput.nextInt();

            hasLoopRanOnce = true;

        }while (!(userResponse >= min && userResponse <= max));

        return userResponse;

    }




    public static String getFactorialString(int num){

        String stringToReturn = "";

        for (int i = 1; i <= num; i++){

            if (i == num){
                stringToReturn += i;
            }else {
                stringToReturn += i + " x ";
            }

        }

        return stringToReturn;
    }

    public static int getFactorialSum(int num){

        int sum = 1;

        for (int i = 2; i <= num; i++){

            sum *= i;

        }

        return sum;

    }



    public static void getFactorial(){

        int factorialNumber = getInteger(1,10);

        for (int i = 1; i <= factorialNumber; i++){

//            System.out.printf("%d! = %s = %d\n",i,getFactorialString(i),getFactorialSum(i));
            System.out.printf("%d! =",i);
            System.out.printf(" %-20s",getFactorialString(i));
            System.out.printf("= %d\n",getFactorialSum(i));

        }

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

//        getFactorial();
//        System.out.println(getFactorialString(6));
//        System.out.println(getFactorialSum(2));
    }
}
