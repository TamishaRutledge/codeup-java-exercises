import java.util.Arrays;
import java.util.Objects;

public class ArraysExercises {



    public static void main(String[] args){

//        These won't print out integers...you need Array.toString for that   //
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
            System.out.println(Arrays.toString(numbers));





        Person[] peeps = new Person[3];
        peeps[0] = new Person("Thor");
        peeps[1] = new Person("Tony");
        peeps[2] = new Person("Steve");

//        An expression is expected after Person...what expression is it expecting in order to iterate????? //
//        Objects.toString still prints gobbeldy gook??????//
//        WHY WON'T YOU STRING OUT?!!??!?!?!?!//


        for (Person person : peeps){
            System.out.println(person.getName());
        }

    }
}
