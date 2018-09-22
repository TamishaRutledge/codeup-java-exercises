package util;

import java.util.Scanner;

public class Input {
    private Scanner scan;

    public Input () {
        scan = new Scanner(System.in).useDelimiter("\n");
    }

    public String getString(){
        return  scan.next();
    }
    public boolean yesNo(){
        System.out.println("Please input y or yes to continue");
        String userInput = getString();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");

    }
    public int getInt(int min, int max){
        System.out.println("Please input and integer between" + min + "and" + max);
        return getInt();
    }
    public int getInt(){
        return scan.nextInt();
    }
    public double getDouble(double min, double max){
        System.out.println("Please input and integer between" + min + "and" + max);
        return getDouble();
    }
    public double getDouble(){
        return scan.nextDouble();
    }


}
