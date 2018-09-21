import java.util.Scanner;

public class Person {

    private String Name;

    // returns the person's name
    public String getName(){
        return Name;
    }

    // changes the name property to the passed value
    public void setName(String name);{
        System.out.println(Name);
    }

    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("Hey how are you " + Name);
    }


    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scan = new Scanner(System.in);
        Name n1 = new Name();

    }
}
