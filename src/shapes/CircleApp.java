package shapes;

import java.util.Scanner;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Welcome to the circle creation application");
        System.out.println("Please input the radius of a new circle");

        double radius = input.getDouble();
        Circle circle = new Circle(radius);

        System.out.print("The area of a circle with radius " + circle.getRadius() + " is: ");
        System.out.println(circle.getArea());
        System.out.print("And the circumference is: ");
        System.out.print(circle.getCircumference());

        public boolean yesNo(){
            System.out.println("Please input y or yes to continue");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.next();
            return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");

        }


    }



}