import java.util.Scanner;

public class MethodsExercises {
    static Scanner scan = new Scanner(System.in).useDelimiter("\n");

    //-------------------PROBLEM 1-----------------------//
//----------------METHOD OVERLOADING-----------------//
    public static void Addition(int i, int j) {
        System.out.println(i + j);
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

    public static void Modulus(int i, int j) {
        System.out.println(i % j);
    }

//---------------------PROBLEM 2--------------------------//

    public static int getInt() {
        int number = scan.nextInt();
        return number;
    }

    public static long getInt(int min, int max) {
        System.out.println("Please input a number between " + min + " and " + max);
        int number = getInt();
        // if the number is in the range of the min and max, then return it.
        if (number >= min && number <= max) {
            return number;
        } else {
            // otherwise, inform the user that their input was outside the range...
            System.out.println(number + " is outside of the range of " + min + " and " + max);

            return getInt(min, max);
        }

//--------------------PROBLEM 3--------------------------//


        public static long factorial( int a){
            int factorial = 1;

            while (a > 1) {
                factorial *= a;
                a--;
            }
            return factorial;
        }
    }

    public static void main(String[] args) {


//-------------------PROBLEM 1-------------------------//
        Addition(3, 4);
        Subtraction(8, 4);
        Multiplication(7, 7);
//----------dividing by zero throws an error-----------//
        Division(9, 3);
        Modulus(10, 2);
//-----------------PROBLEM 2--------------------------//

//        System.out.println(factorial(5));
//        getInt(5);

    }



}
