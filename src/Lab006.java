import java.util.Scanner;

/**
 * had to recommit i didnt make spring2023 branch before i commited
 * A class representing a fraction with a numerator and denominator, and methods to check if the numerator is divisible
 * by the denominator.
 *
 * Programmer: Ricky G
 * CIS 12 Lab006
 */
public class Lab006 {
    // Instance variables
    private int n; // represents numerator
    private int m; // represents denominator

    /**
     * Constructor for Lab006 objects.
     *
     * @param n The numerator of the fraction.
     * @param m The denominator of the fraction.
     */
    public Lab006(int n, int m) {
        this.n = n;
        this.m = m;
    }

    /**
     * Checks if the numerator is evenly divisible by the denominator.
     *
     * @return True if the numerator is divisible by the denominator, false otherwise.
     */
    public boolean isDivisible() {
        if (n % m == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Main method to create a Lab006 object and call its isDivisible method.
     *
     * @param args Command-line arguments (not used in this method).
     */
    public static void main(String[] args) {
        // Prompt the user for two integers and store them in local variables
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer for numerator (n): ");
        int n = input.nextInt();
        System.out.print("Enter an integer for denominator (m): ");
        int m = input.nextInt();

        // Create a new Lab006 object using the constructor
        Lab006 obj = new Lab006(n, m);

        // Call isDivisible method and handle the returned value
        boolean result = obj.isDivisible();
        if (result) {
            System.out.println("The number " + n + " is evenly divisible by " + m);
        } else {
            System.out.println("The number " + n + " is not evenly divisible by " + m);
        }
    }
}
