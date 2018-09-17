import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){

        double pi = 3.14159;

//        System.out.format("The value of pi is approximately %s\n", pi);
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter something: ");
//        int userInput = scanner.nextInt();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter something: ");
//        String userInput = scanner.next();
//        String userInput1 = scanner.next();
//        String userInput2 = scanner.next();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//        System.out.println("You entered: --> \"" + userInput1 + "\" <--");
//        System.out.println("You entered: --> \"" + userInput2 + "\" <--");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered: --> \"" + userInput + "\" <--");
    }
}
