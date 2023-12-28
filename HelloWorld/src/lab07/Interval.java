package lab07;

/**
 * @author Hannah Culver
 * Lab 07
 * 2022 10 02
 */

public class Interval {

    //fields
    private final double lower;
    private final double upper;

    //constructors
    public Interval(double lower, double upper){ //full service c-tor
        if (lower > upper){
            // find reasonable value.
            double average = (lower + upper) / 2;
            System.out.println("Bad data overruled. (" + lower
                    + ", " + upper + ") --> (" + average + ", "
            + average + ").");
            // overrule given arguments
            lower = upper = average;
        }
        this.lower = lower;
        this.upper = upper;
    }

    public Interval(double both){ //one arg c-tor
        this(both, both);
    }

    public Interval(){ //zero arg c-tor
        lower = 0;
        upper = 0;
    }

    //toString method
    public String toString(){
        return "[" + lower + ", " + upper + "]";
    }

    //interval arithmetic
    public Interval plus(Interval rhs){ //addition
        return new Interval (
                this.lower + rhs.lower,
                this.upper + rhs.upper);
    }

    public double getMidpoint(){ //midpoint
        return (this.lower + this.upper) / 2;
    }

    public double getRadius(){ //radius
        return (this.upper - this.lower) / 2;
    }

    //main method
    public static void main(String[] args) {
        System.out.println("Interval class by Hannah Culver");
        System.out.println("CS 2300 Wednesday 5:15-7:05\n");

        Interval banana = new Interval(4, 14);
        System.out.println("banana = " + banana);

        Interval apple = new Interval(4, -2);
        System.out.println("apple = " + apple);

        Interval crisp = new Interval(4);
        System.out.println("crisp = " + crisp);

        Interval zero = new Interval();
        System.out.println("zero = " + zero);

        Interval unit = new Interval(0,1);
        System.out.println("unit = " + unit);

        Interval omega = new Interval(-1,1);
        System.out.println("omega = " + omega);

        System.out.println("");

        Interval i_4_15 = banana.plus(unit);
        System.out.println("i_4_15 = " + i_4_15); // should be [4,15]

        System.out.println("");

        double bananaMP = banana.getMidpoint();
        System.out.println("bananaMP = " + bananaMP); // should be 9

        double bananaR = banana.getRadius();
        System.out.println("bananaR = " + bananaR); // should be 5

        System.out.println("\nBye");
    }
}