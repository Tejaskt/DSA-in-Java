package ds;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Getting input from user
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // Performing division
            int result = divide(numerator, denominator);
            System.out.println("The result of the division is: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter integer values.");
        } finally {
            scanner.close();
            System.out.println("Operation complete.");
        }
    }

    // Division method
    public static int divide(int num1, int num2) throws ArithmeticException {
        return num1 / num2;
    }
}

