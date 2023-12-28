package lab02;

/**
 * @author Hannah Culver
 * Lab 02
 * 2022 08 27
 */

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("from Hannah Culver");

        int x = 4;
        System.out.println("x = " + x);
        x = x + 10;
        System.out.println("x = " + x);
        x += 20;
        System.out.println("x = " + x);

        String a = "Hello";
        String s = " ";
        String b = "World";
        String e = "!";
        String message = a + s + b + e;
        System.out.println(message);
    }
}
