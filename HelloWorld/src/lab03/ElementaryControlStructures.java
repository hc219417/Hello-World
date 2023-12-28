package lab03;

/**
 * @author Hannah Culver
 * Lab 03
 * 2022 09 05
 */

public class ElementaryControlStructures {
    public static void main(String[] args) {
        //System.out.println("Wow! This is cool!");
        System.out.println("Lab 03: Elementary Control Structures");

        System.out.println("\nExpression Values");

        System.out.println("4 < 10: " + (4 < 10));
        System.out.println("4 < 4: " + (4 < 4));
        System.out.println("4 <= 4: " + (4 <= 4));
        System.out.println("4 == 4: " + (4 == 4));
        System.out.println("4 != 4: " + (4 != 4));
        System.out.println("4 % 2 == 0: " + (4 % 2 == 0));
        System.out.println("true: " + true);
        System.out.println("not true: " + !true);

        System.out.println("\nTwo meanings for + operator");
        System.out.println("concatenation: " + 4 + 4);
        System.out.println("addition: " + (4 + 4));

        System.out.println();
        for(int i = 1; i < 10; ++i){
            System.out.println(i + i);
        }

        System.out.println();
        for(int i = 0; i < 20; ++i){
            if(i % 2 == 0){
                System.out.println(i + " is even.");
            }else{
                System.out.println(i + " is odd.");
            }
        }

        System.out.println();
        int total = 0;
        for(int i = 1; i <= 20; ++i){
            total += i;
        }
        System.out.println("total is " + total);

        System.out.println("\n\nGoodbye.\n\n");
    }
}
