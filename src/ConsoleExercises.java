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

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter something: ");
//        String userInput = scanner.nextLine();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the classroom: ");
        String userInput = scanner.nextLine();
        int result = Integer.parseInt(userInput);
        System.out.println(result);

        System.out.print("Enter the width of the classroom: ");
        String userInput1 = scanner.nextLine();
        int result1 = Integer.parseInt(userInput1);
        System.out.println(result1);

        System.out.print("Enter the height of the classroom: ");
        String userInput2 = scanner.nextLine();
        int result2 = Integer.parseInt(userInput2);
        System.out.println(result2);

        System.out.println("The area of the classroom is: --> \"" + result * result1 + "\" <--");
        System.out.println("The perimeter of the classroom is: --> \"" + (2*result + 2*result1) + "\" <--");
        System.out.println("The volume of the classroom is: --> \"" + result * result1 * result2 + "\" <--");
    }
}
