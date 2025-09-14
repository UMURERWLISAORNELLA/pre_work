// SimpleCalculator.java
// A small console calculator that implements add, subtract, multiply, and divide.
// Demonstrates results for 10.5 & 2.5 (required) and 5.0 & 2.0 (extra test).


public class calcu {

    // Returns a + b
    public static double add(double a, double b) {
        return a + b;
    }

    // Returns a - b
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Returns a * b
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Returns a / b; if b == 0 prints a message and returns NaN
    public static double divide(double a, double b) {
        if (b == 0.0) {
            System.out.println("Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }

    // Utility to print the four operations clearly for a pair (a, b)
    public static void printOperations(double a, double b) {
        double sum = add(a, b);

    }

    public static void main(String[] args) {
        double a = 2.0;
        double b = 5.0;

        // Call the methods and display results
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));
    }


}


