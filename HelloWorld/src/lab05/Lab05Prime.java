package lab05;

/**
 * @author Hannah Culver
 * Lab 05
 * 2022 09 18
 */

public class Lab05Prime {
    /**
     * isPrime method tests primality of integers
     * @param n: the integer to test
     * @return true if n is prime, false if n is not prime
     */
    public static boolean isPrime(int n){
        if(n < 2){                          // negative numbers, 0, and 1 are not prime
            return false;
        }
        for(int m = 2; m * m <= n; m++){    // check for a divisor
            if(n % m == 0){
                return false;
            }
        }
        return true;
    }
    public static void makePrimeTable(int primesToFind, int primesPerLine){
        int widthOfTable = 12 * primesPerLine;

        String stringLeft1 = "Prime Number Table";
        String stringRight1 = "CS 2300 Lab Week 05";
        int extraSpaces1 = widthOfTable - stringLeft1.length() - stringRight1.length();

        // this should print one line of a table header the same width as the table
        System.out.println("");
        System.out.print(stringLeft1);
        for(int i = 0; i < extraSpaces1; i++){
            System.out.print(" ");        // one extra space
        }
        System.out.print(stringRight1);
        System.out.println("");

        String stringLeft2 = "Hannah Culver";
        String stringRight2 = "2022 09 18";
        int extraSpaces2 = widthOfTable - stringLeft2.length() - stringRight2.length();

        // this should print the second line of a table header the same width as the table
        // System.out.println("");
        System.out.print(stringLeft2);
        for(int i = 0; i < extraSpaces2; i++){
            System.out.print(" ");        // one extra space
        }
        System.out.print(stringRight2);
        System.out.println("");

        // print two more blank lines after the header
        // System.out.println("");
        // System.out.println("");

        int numberFound = 0;              // number of primes found so far
        int candidateNumber = 0;          // see if this number is prime

        while(numberFound < primesToFind){
            candidateNumber++;
            if(isPrime(candidateNumber)){
                if(numberFound % primesPerLine == 0){
                    System.out.println("");
                }
                numberFound++;
                System.out.printf("%12d", candidateNumber);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Prime Testing");

        System.out.println("   6 is prime? (no) " + isPrime(6));
        System.out.println("   7 is prime? (yes) " + isPrime(7));
        System.out.println("7917 is prime? (no) " + isPrime(7917));
        System.out.println("7919 is prime? (yes) " + isPrime(7919));

        System.out.println("   -1 is prime? (no) " + isPrime(-1));
        System.out.println("    0 is prime? (no) " + isPrime(0));
        System.out.println("    1 is prime? (no) " + isPrime(1));
        System.out.println("54321 is prime? (?) " + isPrime(54321));

        System.out.println("max long: " + Long.MAX_VALUE);

        makePrimeTable(100, 5);

        // after the table of prime numbers is completed, print out a couple of blank lines at the end
        System.out.println("");
        System.out.println("");

        System.out.println("Bye");
    }
}
