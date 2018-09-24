import java.util.Arrays;
import java.util.Objects;

public class ArraysExercises {

    public static Person[] addPerson(Person[] oldArray, Person personToAdd){

        //create an array with new length (old length + 1)
        Person[] newArray = new Person[oldArray.length + 1];

        //loop through old array to add old values to new array
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }

        //add new person to last index in array
        newArray[newArray.length - 1] = personToAdd;

        //return new array
        return newArray;

    }

    public static void main(String[] args){

//        These won't print out integers...you need Array.toString for that   //
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
            System.out.println(Arrays.toString(numbers));


        Person[] peeps = new Person[3];
        peeps[0] = new Person("Thor");
        peeps[1] = new Person("Tony");
        peeps[2] = new Person("Steve");

        System.out.println("Before adding person: ");
        for (Person person : peeps){
            System.out.println(person.getName());
        }

        Person guy = new Person("Guy");
        peeps = addPerson(peeps, guy);

        System.out.println("\n After adding person: ");
        for (Person person : peeps){
            System.out.println(person.getName());
        }

    }
}
