import java.util.Arrays;
import java.util.Objects;

public class ArraysExercises {

    public static void main(String[] args){

        Person[ ] Person = new Person[3];
        Person[0] = new Person("Thor");
        Person[1] = new Person("Tony");
        Person[2] = new Person("Steve");

//        An expression is expected after Person...what expression is it expecting in order to iterate????? //
//        Objects.toString still prints gobbeldy gook??????//
//        WHY WON'T YOU STRING OUT?!!??!?!?!?!//
        for (Person name : Person){
            System.out.println(Objects.toString(name));
        }


//        These won't print out integers...you need Array.toString for that   //
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
    }
}
