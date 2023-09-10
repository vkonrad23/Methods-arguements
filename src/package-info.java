package methods;

import java.util.Scanner;

public class Methods {



    // Define a method to print the output.
    public static void print(String message) {
        System.out.println(message);
    }

    // Define a method to get user input.
    public static String getUserString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    // Define a method to wrap Y/N dialog.
    public static boolean isYes(String question) {
        print(question);
        String answer = getUserString();
        return answer.equalsIgnoreCase("y");
    }

    // Break the program into methods.
    public static void main(String[] args) {
        String name = getUserString( "What is your name? ");
        print("Hello, " + name + "!");

        boolean wantToContinue = true;
        while (wantToContinue) {
            print("Do you want to continue? (y/n) ");
            wantToContinue = isYes("Do you want to continue? (y/n) ");
        }
    }
}
