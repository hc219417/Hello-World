package lab06;

/**
 * Hannah Culver
 * CS 2300
 * Lab 06:
 * TwoInts class
 * 9/25/2022
 */

public class TwoInts {

    //data fields
    private final int a;
    private final int b;

    //methods (constructors)
    public TwoInts (int a, int b){ //full service c-tor
        this.a = a;
        this.b = b;
    }

    public TwoInts (int both){ //one arg c-tor
        this(both, both);
    }

    public TwoInts(){ //zero arg c-tor
        this.a = 0;
        this.b = 0;
    }

    public String toString(){ //toString method
        return "<" + a + ", " + b + ">";
    }

    //getters
    public int getA(){
        return a;
    }

    public int getB(){
        return b;
    }

    /**
     * aIsPos method tests whether an integer is positive
     * @param: none
     * @return true if a is positive, false otherwise
     */
    public boolean aIsPos(){
        if(a > 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Lab 06: TwoInts Class\n");

        TwoInts blue = new TwoInts(4, 11);
        System.out.println("blue = " + blue);

        TwoInts green = new TwoInts(14, -1);
        System.out.println("green = " + green);

        TwoInts one = new TwoInts(144);
        System.out.println("one = " + one);

        TwoInts zero = new TwoInts();
        System.out.println("zero = " + zero);

        System.out.println("");

        System.out.println("blue.a is: " + blue.getA());
        System.out.println("blue.b is: " + blue.getB());

        System.out.println("");

        if(green.aIsPos()){
            System.out.println("Yep!");
        } else {
            System.out.println("Nope!");
        }

        System.out.println("\nGoodbye.");
    }
}