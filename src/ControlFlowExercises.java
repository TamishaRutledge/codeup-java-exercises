import java.sql.SQLOutput;

public class ControlFlowExercises {
    public static void main(String[] args){
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.

//        int i = 5;
//        while (i <= 15){
//            System.out.println("The value of i is: " + i);
//            i++;
//        }
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2,
//        and displays the number squared on each line while the number is less than 1,000,000.

//        int i = 0;
//        do {
//            System.out.println("The value of i is: " + i);
//            i += 2;
//        }while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println("The value of i is: " + i);
//            i -= 5;
//        }while (i >= -10);

//        This does NOT work!! Infinate loop!
        int i = 2;
        do {
            System.out.println("The value of i is: " + i);
            i *= i;
        }while (i < 1000000);

    }
}
