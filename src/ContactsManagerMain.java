import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ContactsManagerMain {

    public static void main(String[] args) throws IOException {
//-----------------directory and file name stored in variables.----------------//

        String directory = "src";
        String filename = "contacts.txt";

        Path contactsDirectory = Paths.get(directory);
        //System.out.println(directory);

        Path contactsFile = Paths.get(directory, filename);
        //System.out.println(filename);


//-----These try/catch exceptions check to see if the named directory and file exist,and creates them if they have not been.-------//

        try {
            if (Files.notExists(contactsDirectory)) {
                Files.createDirectories(contactsDirectory);
                System.out.println("The Directory has been created.");
            }
        } catch(Exception e) {
            System.out.println("That's a negative on creating that Directory.");
            e.printStackTrace();

        }


        try {
            if (!Files.exists(contactsFile)) {
                Files.createFile(contactsFile);
                System.out.println("The File has been created.");
            }
        }  catch (Exception e) { //if path doesn't exist
            System.out.println("Nah! I can't create that file chief.");
            e.printStackTrace();
        }

        List<String> entries = new ArrayList<>();

        boolean notLeaving = true;

        do {
            System.out.println("" +
                    "1. View contacts.\n" +
                    "2. Add a new contact.\n" +
                    "3. Search a contact by name.\n" +
                    "4. Delete an existing contact.\n" +
                    "5. Exit.\n\n" +
                    "Please make a selection: (1, 2, 3, 4 or 5):  ");

            Scanner sc = new Scanner(System.in);
            int userSelection = sc.nextInt();

            switch (userSelection) {
                case 1:
                    showContacts();
                    break;
                case 2:
                    addContacts(sc);
                    break;
                case 3:
                    searchContacts(sc);
                    break;
                case 4:
                    deleteContact(sc);
                    break;
                case 5:
                    notLeaving = false;
                    break;
            }
        } while(notLeaving);

    }

    public static List<String> getContacts(){
        Path contactsFile = Paths.get("src/contacts.txt");

        try {
            return Files.readAllLines(contactsFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void showContacts(){
        String directory = "src";
        String filename = "contacts.txt";
        Path contactsFile = Paths.get(directory, filename);
        try {
            System.out.println(Files.readAllLines(contactsFile));
        }catch(IOException e) {
            e.printStackTrace();
        }
    }


    public static void addContacts(Scanner sc) {
        List<String> entries = new ArrayList<>();
        System.out.println("Enter the first name of the contact: \n");
        String firstName = sc.next();
        System.out.println("Enter the last name of the contact: \n");
        String lastName = sc.next();
        System.out.println("what is the phone number for the contact?\n");
        String addedNumber = sc.next();

        String directory = "src";
        String filename = "contacts.txt";
        Path contactsFile = Paths.get(directory, filename);

        entries.add(firstName + " " + lastName + "|" + addedNumber);

//---------Shoutout to Daniel for finding that .APPEND command in class! <hands clapping emoji>---------//
        try {
            Files.write(contactsFile, entries, StandardOpenOption.APPEND);
        } catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println("Contact: " + "\"" + firstName + " " + lastName + " | " + addedNumber + "\"" + " has been added to your list of contacts\n");
    }


    public static void searchContacts(Scanner sc) {

        List<String> entries = getContacts();
        System.out.println("Which contact are you looking for? \n");
        String userSearch = sc.next();

//---------------for loop through the entries and for every entry, system out it out to see if it contains search term-----//
        for(int i = 0; i < entries.size(); i++) {
            if(entries.get(i).contains(userSearch)) {
                System.out.println(entries.get(i));
            }
        }
    }

    public static void deleteContact(Scanner sc) {

        List<String> entries = getContacts();
        System.out.println("Which contact are you looking to remove from the list? \n");
        String userSearch = sc.next();

//---------------for loop through the entries and for every entry, system out it out to see if it contains search term-----//
        int indexOfDelete = -1;
        for(int i = 0; i < entries.size(); i++) {
            if(entries.get(i).contains(userSearch)) {
                indexOfDelete = i;
            }
        }

        System.out.println("Are you sure you want to remove this contact?[y/n] : "+ entries.get(indexOfDelete));
        String confirm = sc.next();
        if(confirm.equalsIgnoreCase("y")){
            entries.remove(indexOfDelete);
            try {
                Files.write(Paths.get("src/contacts.txt"), entries);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }




}