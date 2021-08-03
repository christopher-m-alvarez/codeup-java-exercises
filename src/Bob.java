import java.util.Scanner;


public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Say something to Bob: ");
        String usersResponse =  scanner.nextLine();

        if (usersResponse.endsWith("!")){

            System.out.println("Whoa, chill out!");

        }else  if (usersResponse.endsWith("?")){

            System.out.println("Sure.");

        }else if (usersResponse.startsWith(" ")){

            System.out.println("Fine. Be that way!");
        } else{
                System.out.println("Whatever.");
        }
    }
}
