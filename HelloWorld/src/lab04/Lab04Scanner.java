package lab04;

import java.util.Scanner;

/**
 * @author Hannah Culver
 * Lab 04
 * 2022 09 12
 */

public class Lab04Scanner {
    private static Scanner scanner = new Scanner(System.in);

    public static void demoTextLine(String prompt){
        System.out.println("Enter a line of text. " + prompt + ": ");
        String input = scanner.nextLine();
        System.out.println("Your input text is '" + input + "'.");
    }

    public static void demoInt(){
        System.out.println("Enter an integer: ");
        int input = scanner.nextInt();
        System.out.println("You entered " + input + ".");
    }

    public static void demoDouble(){
        System.out.println("Enter a double: ");
        double input = scanner.nextDouble();
        System.out.println("You entered " + input + ".");

    }

    public static void main(String[] args) {
        System.out.println("Lab 04: Start of Scanner Project");

        demoTextLine("one");
        demoTextLine("two");

        demoInt();
        demoInt();
        demoInt();

        demoTextLine("three");
        demoTextLine("four");
        demoTextLine("five");

        demoDouble();
        demoDouble();
        demoDouble();
        demoDouble();

        System.out.println("End of Scanner Project. Goodbye!");
    }
}
