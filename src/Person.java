import java.util.Scanner;

public class Person {

    private String Name = "new new";

    public Person () {
        System.out.println("What is your name?");
    }

    // this is a getter to get the person's name
    public String getName(){
        return Name;
    }

    // this is a setter to get teh person's name
    public void setName(String Name){
        System.out.println(Name);
    }

    // put out a message with the name
    public void sayHello() {
        System.out.println("Hey how are you " + Name);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person me = new Person();
        me.getName();
        me.setName("John");
        me.sayHello();




    }
}
