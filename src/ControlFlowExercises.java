import java.util.Scanner;




public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//        for(int i = 5; i <=15; i++){
//            System.out.println(i);
//        }

//        int i = 0;
//        do {
//            i = i + 2;
//            System.out.println(i);
//        } while (i <= 98);


        //        int i = 100;
//        do {
//            i = i -5;
//            System.out.println(i);
//        } while (i >= -5);

//        double i = 2;
//        do {
//            i = Math.pow(i,2);
//            System.out.println(i);
//        } while (i <= 1000000);

//        for(int i = 1; i <= 100; i++){
//            if(i % 15 == 0){
//                System.out.println("FizzBuzz");
//            } else if(i % 5 == 0){
//                System.out.println("Buzz");
//            } else if(i % 3 == 0){
//                System.out.println("fizz");
//            } else{
//                System.out.println(i);
//            }
//        }


        boolean userContinues = true;

        do{
            System.out.println("To number: ");
            int userInt = scanner.nextInt();
            System.out.println();
            System.out.println("\nTable\n");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int i = 1; i<= userInt; i++){
                System.out.printf("%-6d", i);
                System.out.print(" | ");
                System.out.printf("%-7d", i * i);
                System.out.print(" | ");
                System.out.print(i * i * i );
                System.out.println();
            }
            System.out.println("Would you like another number (y/n)?");
            String userResponse = scanner.next();
            if (!userResponse.equalsIgnoreCase("y")){
                userContinues = false;
            }

        }while(userContinues);



    }
}
