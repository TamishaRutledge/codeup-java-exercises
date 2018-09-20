import java.util.Scanner;

public class MethodsExercises {

//-------------------PROBLEM 1-----------------------//
    public static void Addition(int i, int j) {
        System.out.println(i+j);
    }

    public static void Subtraction(int i, int j) {
        System.out.println(i - j);
    }
//------------------Do the bonus for this one-----------//
    public static void Multiplication(int i, int j) {
        System.out.println(i * j);
    }

    public static void Division(int i, int j) {
        System.out.println(i / j);
    }

    public static void Modulus(int i, int j){
        System.out.println(i % j);
    }

//---------------------PROBLEM 2--------------------------//

    public static int getInteger(int min, int max){
        System.out.println("Please enter a number between 1 and 10.");
        Scanner userInput = new Scanner(System.in);
//        int input;
        if (userInput >= min && userInput <= max){
            return userInput;
        }
        else{
            System.out.println("Number out of range, try again.");
        }

    }


    public static void main(String[] args) {
//-------------------PROBLEM 1-------------------------//
        Addition(3, 4);
        Subtraction(8,4);
        Multiplication(7,7);
//----------dividing by zero throws an error-----------//
        Division(9,3);
        Modulus(10,2);
//-----------------PROBLEM 2--------------------------//
        getInteger(1,10);
    }
}
