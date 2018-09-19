import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.

//        int i = 5;
//        while (i <= 15){
//            System.out.print(i + " ");
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

//        Needed to use a long data type instead of an int!
//        long i = 2;
//        do {
//            System.out.println("The value of i is: " + i);
//            i *= i;
//        }while (i < 1000000);

//--------------------REFACTOR USING A FOR LOOP---------------------------//

//        Create an integer variable i with a value of 5.
//        Create a for loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.

//        for (int i = 5; i <= 15; i++ ){
//            System.out.println("The value of i is: " + i);
//        }
//        Create a for loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a for loop that starts at 2,
//        and displays the number squared on each line while the number is less than 1,000,000.

//        for (int i = 0; i <= 100; i += 2){
//            System.out.println("The value of i is: " + i);
//        }

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println("The value of i is: " + i);
//        }

//            for (long i = 2; i <= 1000000; i *= i){
//                System.out.println("The value of i is: " + i);
//            }

//------------------------FIZZBUZZ--------------------------------//
//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three print “Fizz” instead of the number
//        For the multiples of five print “Buzz”.
//        For numbers which are multiples of both three and five print “FizzBuzz”.

//        for (int i = 1; i <= 100; i++){
//            if(i % 15 == 0){
//                System.out.println("FizzBuzz");
//            } else if(i % 3 == 0){
//                System.out.println("Fizz");
//            } else if(i % 5 == 0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
//-------------------------------------------Integers, Squares, and Cubes--------------------------------------------------------------//
//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        boolean wantsToContinue;
//        Scanner scanner = new Scanner(System.in);
//        do {
//
//            System.out.print("What number would you like to go up to? ");
//            int userInput = scanner.nextInt();
//            System.out.println("You entered: --> \"" + userInput + "\" <--");
//            System.out.println("| integer | square | cube |");
//            for (int i = 1; i <= userInput; i++) {
//                if (i < userInput) {
//                    System.out.println("     " + i + "        " + i*i + "     " + i*i*i);
////                    System.out.println(i * i);
////                    System.out.println(i * i * i);
//                } else if (i == userInput) {
//                    System.out.println("     " + userInput + "        " + userInput*userInput + "     " + userInput*userInput*userInput);
////                    System.out.println(userInput * userInput);
////                    System.out.println(userInput * userInput * userInput);
//                } else {
//                    System.out.println("Try it again!");
//
//                }
//            }
//            System.out.println("Thanks for playing, do you want to go again? Type y to continue.");
//            String UserResponse = scanner.nextLine();
//            wantsToContinue = UserResponse.equalsIgnoreCase("y");
//        }while(wantsToContinue);

//        Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0
//        Bonus
//
//        Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).
        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println("Enter a numerical grade from 0 to 100: ");

        while ((input = scanner.nextInt()) != 0) {
            if (input >= 88) {
                System.out.println("A");
            } else if (input >= 80 && input <= 87) {
                System.out.println("B");
            } else if (input <= 79 && input >= 67) {
                System.out.println("C");
            } else if (input >= 60 && input <= 66) {
                System.out.println("D");
            } else if (input >= 0 && input <= 59) {
                System.out.println("F");
            }
            System.out.println("Would you like to quit? Enter y or n: ");
            String response = scanner.next();
            boolean confirmation = response.equals("y");
            if (confirmation) {
                break;
            }
            System.out.println("Enter a numerical grade from 0 to 100: ");
        }
    }
}
