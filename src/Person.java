import java.util.Scanner;

public class Person {

    private String Name;

    public Person (String Name) {
        this.Name = Name;
    }

    // this is a getter to get the person's name
    //getters ask questions
    public String getName(){
        return Name;
    }

    // this is a setter to get teh person's name
    //setters are commands
    public void setName(String Name){
        System.out.println(Name);
    }

    // put out a message with the name
    public void sayHello() {
        System.out.println("Hey how are you " + Name);
    }

    public static void main(String[] args) {
        Person me = new Person("Jim");

        me.getName();
        me.setName("Jake");
        me.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());


    }
}
