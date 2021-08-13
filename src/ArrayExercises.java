import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {


//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];

        people[0] = new Person("Chris");
        people[1] = new Person("Winston");
        people[2] = new Person("Cheese");

        for (Person value : people) {
            System.out.println(value.getName());
        }

        people = addPerson(people, new Person("Mike Jones"));

        for (Person person : people){
            System.out.println(person.getName());
        }

    }


    public static Person[] addPerson(Person[] people, Person personToAdd){
        Person[] newPeopleArray = Arrays.copyOf(people, people.length + 1);

        newPeopleArray[newPeopleArray.length - 1] = personToAdd;

        return newPeopleArray;
    }

}


// # lecture examples


//    String[] languages = {"html", "css", "javascript", "java"};
//
//for (int i = 0; i < languages.length; i += 1) {
//        System.out.println(languages[i]);
//        }

//    String[] languages = {"html", "css", "javascript", "java"};
//
//for (String language : languages) {
//        System.out.println(language);
//        }



//    int[] numbers = {1, 2, 3, 4, 5};
//for (int n : numbers) {
//        System.out.println(n);
//        }


//    int[][] matrix = {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9}
//    };
//
//for (int[] row : matrix) {
//        System.out.println("+---+---+---+");
//
//        System.out.print("| ");
//
//        for (int n : row) {
//        System.out.print(n + " | ");
//        }
//
//        System.out.println();
//        }
//
//        System.out.println("+---+---+---+");


// Should look like this after ^
//        +---+---+---+
//        | 1 | 2 | 3 |
//        +---+---+---+
//        | 4 | 5 | 6 |
//        +---+---+---+
//        | 7 | 8 | 9 |
//        +---+---+---+

