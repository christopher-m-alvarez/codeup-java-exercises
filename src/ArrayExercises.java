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
